package mage.cards.a;

import java.util.UUID;
import mage.abilities.Ability;
import mage.abilities.DelayedTriggeredAbility;
import mage.abilities.common.delayed.AtTheBeginOfNextUpkeepDelayedTriggeredAbility;
import mage.abilities.dynamicvalue.common.StaticValue;
import mage.abilities.effects.Effect;
import mage.abilities.effects.OneShotEffect;
import mage.abilities.effects.common.CreateDelayedTriggeredAbilityEffect;
import mage.abilities.effects.common.DrawCardSourceControllerEffect;
import mage.abilities.effects.common.DrawCardTargetEffect;
import mage.cards.Card;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.game.Game;
import mage.players.Player;
import mage.target.TargetSpell;
import mage.target.targetpointer.FixedTarget;

/**
 *
 * @author LevelX2
 */
public final class ArcaneDenial extends CardImpl {

    public ArcaneDenial(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.INSTANT}, "{1}{U}");

        // Counter target spell. Its controller may draw up to two cards at 
        // the beginning of the next turn's upkeep.
        this.getSpellAbility().addEffect(new ArcaneDenialEffect());
        this.getSpellAbility().addTarget(new TargetSpell());
        // You draw a card at the beginning of the next turn's upkeep.
        this.getSpellAbility().addEffect(new CreateDelayedTriggeredAbilityEffect(
                new AtTheBeginOfNextUpkeepDelayedTriggeredAbility(
                        new DrawCardSourceControllerEffect(1)), false));
    }

    public ArcaneDenial(final ArcaneDenial card) {
        super(card);
    }

    @Override
    public ArcaneDenial copy() {
        return new ArcaneDenial(this);
    }
}

class ArcaneDenialEffect extends OneShotEffect {

    public ArcaneDenialEffect() {
        super(Outcome.Detriment);
        staticText = "Counter target spell. Its controller may draw up to two cards "
                + "at the beginning of the next turn's upkeep";
    }

    public ArcaneDenialEffect(final ArcaneDenialEffect effect) {
        super(effect);
    }

    @Override
    public ArcaneDenialEffect copy() {
        return new ArcaneDenialEffect(this);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Card originalSourceCard; // needed for copies of Arcane Denial See Bug #5437
        Player controller = null;
        boolean countered = false;
        // If the source originates from a copy (Isochron Scepter for example),
        // then we set the source's sourceId to the original card, otherwise it 
        // uses the spell on the stack as its sourceObject which won't work
        // correctly with any cards that make use of Delayed Triggers.
        // see Bug #5437
        Card cardToCheck = game.getCard(source.getSourceId());
        if (cardToCheck != null
                && cardToCheck.isCopy()) { // Isochron Scepter imprinted card for example
            originalSourceCard = (Card) game.getState().getValue("RememberSourceObject" + source.getSourceId());
            if (originalSourceCard != null) {
                source.setSourceId(originalSourceCard.getId());
            }
        }
        UUID targetId = this.getTargetPointer().getFirst(game, source);
        if (targetId != null) {
            controller = game.getPlayer(game.getControllerId(targetId));
        }
        if (targetId != null
                && game.getStack().counter(targetId, source.getSourceId(), game)) {
            countered = true;
        }
        if (controller != null) {
            Effect effect = new DrawCardTargetEffect(StaticValue.get(2), false, true);
            effect.setTargetPointer(new FixedTarget(controller.getId()));
            effect.setText("Its controller may draw up to two cards");
            DelayedTriggeredAbility ability = new AtTheBeginOfNextUpkeepDelayedTriggeredAbility(effect);
            game.addDelayedTriggeredAbility(ability, source);
        }
        return countered;
    }

}
