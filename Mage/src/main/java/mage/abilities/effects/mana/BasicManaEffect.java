package mage.abilities.effects.mana;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import mage.ConditionalMana;
import mage.Mana;
import mage.abilities.Ability;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.effects.common.ManaEffect;
import mage.game.Game;

public class BasicManaEffect extends ManaEffect {

    protected Mana manaTemplate;
    private final DynamicValue netAmount;

    public BasicManaEffect(Mana mana) {
        this(mana, null);
        this.manaTemplate = mana;
    }

    public BasicManaEffect(Mana mana, DynamicValue netAmount) {
        super();
        this.manaTemplate = mana;
        staticText = "add " + mana.toString();
        this.netAmount = netAmount;
    }

    public BasicManaEffect(ConditionalMana conditionalMana) {
        super();
        this.manaTemplate = conditionalMana;
        staticText = "add " + manaTemplate.toString() + " " + conditionalMana.getDescription();
        this.netAmount = null;
    }

    public BasicManaEffect(final BasicManaEffect effect) {
        super(effect);
        this.manaTemplate = effect.manaTemplate.copy();
        this.netAmount = effect.netAmount;

    }

    @Override
    public List<Mana> getNetMana(Game game, Ability source) {
        if (game != null && game.inCheckPlayableState() && netAmount != null) {
            // calculate the maximum available mana
            int count = netAmount.calculate(game, source, this);
            Mana computedMana = new Mana();
            if (manaTemplate.getBlack() > 0) {
                computedMana.setBlack(count * manaTemplate.getBlack());
            } else if (manaTemplate.getBlue() > 0) {
                computedMana.setBlue(count * manaTemplate.getBlue());
            } else if (manaTemplate.getGreen() > 0) {
                computedMana.setGreen(count * manaTemplate.getGreen());
            } else if (manaTemplate.getRed() > 0) {
                computedMana.setRed(count * manaTemplate.getRed());
            } else if (manaTemplate.getWhite() > 0) {
                computedMana.setWhite(count * manaTemplate.getWhite());
            } else if (manaTemplate.getColorless() > 0) {
                computedMana.setColorless(count * manaTemplate.getColorless());
            } else if (manaTemplate.getAny() > 0) {
                computedMana.setAny(count * manaTemplate.getAny());
            } else if (manaTemplate.getGeneric() > 0){
                computedMana.setGeneric(count * manaTemplate.getGeneric());
            }
            return new ArrayList<>(Arrays.asList(computedMana));
        }
        return super.getNetMana(game, source);
    }

    @Override
    public BasicManaEffect copy() {
        return new BasicManaEffect(this);
    }

    public Mana getManaTemplate() {
        return manaTemplate;
    }

    @Override
    public Mana produceMana(Game game, Ability source) {
        return manaTemplate.copy();
    }

}
