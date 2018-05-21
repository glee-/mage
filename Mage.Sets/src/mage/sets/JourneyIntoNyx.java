/*
* Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
*
* Redistribution and use in source and binary forms, with or without modification, are
* permitted provided that the following conditions are met:
*
*    1. Redistributions of source code must retain the above copyright notice, this list of
*       conditions and the following disclaimer.
*
*    2. Redistributions in binary form must reproduce the above copyright notice, this list
*       of conditions and the following disclaimer in the documentation and/or other materials
*       provided with the distribution.
*
* THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
* WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
* FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
* CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
* CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
* SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
* ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
* NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
* ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*
* The views and conclusions contained in the software and documentation are those of the
* authors and should not be interpreted as representing official policies, either expressed
* or implied, of BetaSteward_at_googlemail.com.
 */
package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 *
 * @author LevelX2
 */
public final class JourneyIntoNyx extends ExpansionSet {

    private static final JourneyIntoNyx instance = new JourneyIntoNyx();

    public static JourneyIntoNyx getInstance() {
        return instance;
    }

    private JourneyIntoNyx() {
        super("Journey into Nyx", "JOU", ExpansionSet.buildDate(2014, 5, 2), SetType.EXPANSION);
        this.blockName = "Theros";
        this.parentSet = Theros.getInstance();
        this.hasBasicLands = false;
        this.hasBoosters = true;
        this.numBoosterLands = 1;
        this.numBoosterCommon = 10;
        this.numBoosterUncommon = 3;
        this.numBoosterRare = 1;
        this.ratioBoosterMythic = 8;
        cards.add(new SetCardInfo("Aegis of the Gods", 1, Rarity.RARE, mage.cards.a.AegisOfTheGods.class));
        cards.add(new SetCardInfo("Aerial Formation", 30, Rarity.COMMON, mage.cards.a.AerialFormation.class));
        cards.add(new SetCardInfo("Agent of Erebos", 59, Rarity.UNCOMMON, mage.cards.a.AgentOfErebos.class));
        cards.add(new SetCardInfo("Ajani, Mentor of Heroes", 145, Rarity.MYTHIC, mage.cards.a.AjaniMentorOfHeroes.class));
        cards.add(new SetCardInfo("Ajani's Presence", 2, Rarity.COMMON, mage.cards.a.AjanisPresence.class));
        cards.add(new SetCardInfo("Akroan Line Breaker", 88, Rarity.UNCOMMON, mage.cards.a.AkroanLineBreaker.class));
        cards.add(new SetCardInfo("Akroan Mastiff", 3, Rarity.COMMON, mage.cards.a.AkroanMastiff.class));
        cards.add(new SetCardInfo("Armament of Nyx", 4, Rarity.COMMON, mage.cards.a.ArmamentOfNyx.class));
        cards.add(new SetCardInfo("Armory of Iroas", 158, Rarity.UNCOMMON, mage.cards.a.ArmoryOfIroas.class));
        cards.add(new SetCardInfo("Aspect of Gorgon", 60, Rarity.COMMON, mage.cards.a.AspectOfGorgon.class));
        cards.add(new SetCardInfo("Athreos, God of Passage", 146, Rarity.MYTHIC, mage.cards.a.AthreosGodOfPassage.class));
        cards.add(new SetCardInfo("Banishing Light", 5, Rarity.UNCOMMON, mage.cards.b.BanishingLight.class));
        cards.add(new SetCardInfo("Bassara Tower Archer", 117, Rarity.UNCOMMON, mage.cards.b.BassaraTowerArcher.class));
        cards.add(new SetCardInfo("Battlefield Thaumaturge", 31, Rarity.RARE, mage.cards.b.BattlefieldThaumaturge.class));
        cards.add(new SetCardInfo("Bearer of the Heavens", 89, Rarity.RARE, mage.cards.b.BearerOfTheHeavens.class));
        cards.add(new SetCardInfo("Bladetusk Boar", 90, Rarity.COMMON, mage.cards.b.BladetuskBoar.class));
        cards.add(new SetCardInfo("Blinding Flare", 91, Rarity.UNCOMMON, mage.cards.b.BlindingFlare.class));
        cards.add(new SetCardInfo("Bloodcrazed Hoplite", 61, Rarity.COMMON, mage.cards.b.BloodcrazedHoplite.class));
        cards.add(new SetCardInfo("Brain Maggot", 62, Rarity.UNCOMMON, mage.cards.b.BrainMaggot.class));
        cards.add(new SetCardInfo("Cast into Darkness", 63, Rarity.COMMON, mage.cards.c.CastIntoDarkness.class));
        cards.add(new SetCardInfo("Chariot of Victory", 159, Rarity.UNCOMMON, mage.cards.c.ChariotOfVictory.class));
        cards.add(new SetCardInfo("Cloaked Siren", 32, Rarity.COMMON, mage.cards.c.CloakedSiren.class));
        cards.add(new SetCardInfo("Colossal Heroics", 118, Rarity.UNCOMMON, mage.cards.c.ColossalHeroics.class));
        cards.add(new SetCardInfo("Consign to Dust", 119, Rarity.UNCOMMON, mage.cards.c.ConsignToDust.class));
        cards.add(new SetCardInfo("Countermand", 33, Rarity.COMMON, mage.cards.c.Countermand.class));
        cards.add(new SetCardInfo("Cruel Feeding", 64, Rarity.COMMON, mage.cards.c.CruelFeeding.class));
        cards.add(new SetCardInfo("Crystalline Nautilus", 34, Rarity.UNCOMMON, mage.cards.c.CrystallineNautilus.class));
        cards.add(new SetCardInfo("Cyclops of Eternal Fury", 92, Rarity.UNCOMMON, mage.cards.c.CyclopsOfEternalFury.class));
        cards.add(new SetCardInfo("Dakra Mystic", 35, Rarity.UNCOMMON, mage.cards.d.DakraMystic.class));
        cards.add(new SetCardInfo("Daring Thief", 36, Rarity.RARE, mage.cards.d.DaringThief.class));
        cards.add(new SetCardInfo("Dawnbringer Charioteers", 6, Rarity.RARE, mage.cards.d.DawnbringerCharioteers.class));
        cards.add(new SetCardInfo("Deicide", 7, Rarity.RARE, mage.cards.d.Deicide.class));
        cards.add(new SetCardInfo("Desecration Plague", 120, Rarity.COMMON, mage.cards.d.DesecrationPlague.class));
        cards.add(new SetCardInfo("Deserter's Quarters", 160, Rarity.UNCOMMON, mage.cards.d.DesertersQuarters.class));
        cards.add(new SetCardInfo("Desperate Stand", 147, Rarity.UNCOMMON, mage.cards.d.DesperateStand.class));
        cards.add(new SetCardInfo("Dictate of Erebos", 65, Rarity.RARE, mage.cards.d.DictateOfErebos.class));
        cards.add(new SetCardInfo("Dictate of Heliod", 8, Rarity.RARE, mage.cards.d.DictateOfHeliod.class));
        cards.add(new SetCardInfo("Dictate of Karametra", 121, Rarity.RARE, mage.cards.d.DictateOfKarametra.class));
        cards.add(new SetCardInfo("Dictate of Kruphix", 37, Rarity.RARE, mage.cards.d.DictateOfKruphix.class));
        cards.add(new SetCardInfo("Dictate of the Twin Gods", 93, Rarity.RARE, mage.cards.d.DictateOfTheTwinGods.class));
        cards.add(new SetCardInfo("Disciple of Deceit", 148, Rarity.UNCOMMON, mage.cards.d.DiscipleOfDeceit.class));
        cards.add(new SetCardInfo("Doomwake Giant", 66, Rarity.RARE, mage.cards.d.DoomwakeGiant.class));
        cards.add(new SetCardInfo("Dreadbringer Lampads", 67, Rarity.COMMON, mage.cards.d.DreadbringerLampads.class));
        cards.add(new SetCardInfo("Eagle of the Watch", 9, Rarity.COMMON, mage.cards.e.EagleOfTheWatch.class));
        cards.add(new SetCardInfo("Eidolon of Blossoms", 122, Rarity.RARE, mage.cards.e.EidolonOfBlossoms.class));
        cards.add(new SetCardInfo("Eidolon of Rhetoric", 10, Rarity.UNCOMMON, mage.cards.e.EidolonOfRhetoric.class));
        cards.add(new SetCardInfo("Eidolon of the Great Revel", 94, Rarity.RARE, mage.cards.e.EidolonOfTheGreatRevel.class));
        cards.add(new SetCardInfo("Extinguish All Hope", 68, Rarity.RARE, mage.cards.e.ExtinguishAllHope.class));
        cards.add(new SetCardInfo("Feast of Dreams", 69, Rarity.COMMON, mage.cards.f.FeastOfDreams.class));
        cards.add(new SetCardInfo("Felhide Petrifier", 70, Rarity.UNCOMMON, mage.cards.f.FelhidePetrifier.class));
        cards.add(new SetCardInfo("Flamespeaker's Will", 95, Rarity.COMMON, mage.cards.f.FlamespeakersWill.class));
        cards.add(new SetCardInfo("Fleetfeather Cockatrice", 149, Rarity.UNCOMMON, mage.cards.f.FleetfeatherCockatrice.class));
        cards.add(new SetCardInfo("Flurry of Horns", 96, Rarity.COMMON, mage.cards.f.FlurryOfHorns.class));
        cards.add(new SetCardInfo("Font of Fertility", 123, Rarity.COMMON, mage.cards.f.FontOfFertility.class));
        cards.add(new SetCardInfo("Font of Fortunes", 38, Rarity.COMMON, mage.cards.f.FontOfFortunes.class));
        cards.add(new SetCardInfo("Font of Ire", 97, Rarity.COMMON, mage.cards.f.FontOfIre.class));
        cards.add(new SetCardInfo("Font of Return", 71, Rarity.COMMON, mage.cards.f.FontOfReturn.class));
        cards.add(new SetCardInfo("Font of Vigor", 11, Rarity.COMMON, mage.cards.f.FontOfVigor.class));
        cards.add(new SetCardInfo("Forgeborn Oreads", 98, Rarity.UNCOMMON, mage.cards.f.ForgebornOreads.class));
        cards.add(new SetCardInfo("Gluttonous Cyclops", 99, Rarity.COMMON, mage.cards.g.GluttonousCyclops.class));
        cards.add(new SetCardInfo("Gnarled Scarhide", 72, Rarity.UNCOMMON, mage.cards.g.GnarledScarhide.class));
        cards.add(new SetCardInfo("Godhunter Octopus", 39, Rarity.COMMON, mage.cards.g.GodhunterOctopus.class));
        cards.add(new SetCardInfo("Godsend", 12, Rarity.MYTHIC, mage.cards.g.Godsend.class));
        cards.add(new SetCardInfo("Goldenhide Ox", 125, Rarity.UNCOMMON, mage.cards.g.GoldenhideOx.class));
        cards.add(new SetCardInfo("Golden Hind", 124, Rarity.COMMON, mage.cards.g.GoldenHind.class));
        cards.add(new SetCardInfo("Gold-Forged Sentinel", 161, Rarity.UNCOMMON, mage.cards.g.GoldForgedSentinel.class));
        cards.add(new SetCardInfo("Grim Guardian", 73, Rarity.COMMON, mage.cards.g.GrimGuardian.class));
        cards.add(new SetCardInfo("Hall of Triumph", 162, Rarity.RARE, mage.cards.h.HallOfTriumph.class));
        cards.add(new SetCardInfo("Harness by Force", 100, Rarity.RARE, mage.cards.h.HarnessByForce.class));
        cards.add(new SetCardInfo("Harvestguard Alseids", 13, Rarity.COMMON, mage.cards.h.HarvestguardAlseids.class));
        cards.add(new SetCardInfo("Heroes' Bane", 126, Rarity.RARE, mage.cards.h.HeroesBane.class));
        cards.add(new SetCardInfo("Hour of Need", 40, Rarity.UNCOMMON, mage.cards.h.HourOfNeed.class));
        cards.add(new SetCardInfo("Hubris", 41, Rarity.COMMON, mage.cards.h.Hubris.class));
        cards.add(new SetCardInfo("Humbler of Mortals", 127, Rarity.COMMON, mage.cards.h.HumblerOfMortals.class));
        cards.add(new SetCardInfo("Hydra Broodmaster", 128, Rarity.RARE, mage.cards.h.HydraBroodmaster.class));
        cards.add(new SetCardInfo("Hypnotic Siren", 42, Rarity.RARE, mage.cards.h.HypnoticSiren.class));
        cards.add(new SetCardInfo("Interpret the Signs", 43, Rarity.UNCOMMON, mage.cards.i.InterpretTheSigns.class));
        cards.add(new SetCardInfo("Iroas, God of Victory", 150, Rarity.MYTHIC, mage.cards.i.IroasGodOfVictory.class));
        cards.add(new SetCardInfo("Keranos, God of Storms", 151, Rarity.MYTHIC, mage.cards.k.KeranosGodOfStorms.class));
        cards.add(new SetCardInfo("King Macar, the Gold-Cursed", 74, Rarity.RARE, mage.cards.k.KingMacarTheGoldCursed.class));
        cards.add(new SetCardInfo("Kiora's Dismissal", 44, Rarity.UNCOMMON, mage.cards.k.KiorasDismissal.class));
        cards.add(new SetCardInfo("Knowledge and Power", 101, Rarity.UNCOMMON, mage.cards.k.KnowledgeAndPower.class));
        cards.add(new SetCardInfo("Kruphix, God of Horizons", 152, Rarity.MYTHIC, mage.cards.k.KruphixGodOfHorizons.class));
        cards.add(new SetCardInfo("Kruphix's Insight", 129, Rarity.COMMON, mage.cards.k.KruphixsInsight.class));
        cards.add(new SetCardInfo("Lagonna-Band Trailblazer", 14, Rarity.COMMON, mage.cards.l.LagonnaBandTrailblazer.class));
        cards.add(new SetCardInfo("Launch the Fleet", 15, Rarity.RARE, mage.cards.l.LaunchTheFleet.class));
        cards.add(new SetCardInfo("Leonin Iconoclast", 16, Rarity.UNCOMMON, mage.cards.l.LeoninIconoclast.class));
        cards.add(new SetCardInfo("Lightning Diadem", 102, Rarity.COMMON, mage.cards.l.LightningDiadem.class));
        cards.add(new SetCardInfo("Magma Spray", 103, Rarity.COMMON, mage.cards.m.MagmaSpray.class));
        cards.add(new SetCardInfo("Mana Confluence", 163, Rarity.RARE, mage.cards.m.ManaConfluence.class));
        cards.add(new SetCardInfo("Market Festival", 130, Rarity.COMMON, mage.cards.m.MarketFestival.class));
        cards.add(new SetCardInfo("Master of the Feast", 75, Rarity.RARE, mage.cards.m.MasterOfTheFeast.class));
        cards.add(new SetCardInfo("Mogis's Warhound", 104, Rarity.UNCOMMON, mage.cards.m.MogissWarhound.class));
        cards.add(new SetCardInfo("Mortal Obstinacy", 17, Rarity.COMMON, mage.cards.m.MortalObstinacy.class));
        cards.add(new SetCardInfo("Nature's Panoply", 131, Rarity.COMMON, mage.cards.n.NaturesPanoply.class));
        cards.add(new SetCardInfo("Nessian Game Warden", 132, Rarity.UNCOMMON, mage.cards.n.NessianGameWarden.class));
        cards.add(new SetCardInfo("Nightmarish End", 76, Rarity.UNCOMMON, mage.cards.n.NightmarishEnd.class));
        cards.add(new SetCardInfo("Nyx-Fleece Ram", 18, Rarity.UNCOMMON, mage.cards.n.NyxFleeceRam.class));
        cards.add(new SetCardInfo("Nyx Infusion", 77, Rarity.COMMON, mage.cards.n.NyxInfusion.class));
        cards.add(new SetCardInfo("Nyx Weaver", 153, Rarity.UNCOMMON, mage.cards.n.NyxWeaver.class));
        cards.add(new SetCardInfo("Oakheart Dryads", 133, Rarity.COMMON, mage.cards.o.OakheartDryads.class));
        cards.add(new SetCardInfo("Oppressive Rays", 19, Rarity.COMMON, mage.cards.o.OppressiveRays.class));
        cards.add(new SetCardInfo("Oreskos Swiftclaw", 20, Rarity.COMMON, mage.cards.o.OreskosSwiftclaw.class));
        cards.add(new SetCardInfo("Pensive Minotaur", 105, Rarity.COMMON, mage.cards.p.PensiveMinotaur.class));
        cards.add(new SetCardInfo("Phalanx Formation", 21, Rarity.UNCOMMON, mage.cards.p.PhalanxFormation.class));
        cards.add(new SetCardInfo("Pharika, God of Affliction", 154, Rarity.MYTHIC, mage.cards.p.PharikaGodOfAffliction.class));
        cards.add(new SetCardInfo("Pharika's Chosen", 78, Rarity.COMMON, mage.cards.p.PharikasChosen.class));
        cards.add(new SetCardInfo("Pheres-Band Thunderhoof", 134, Rarity.COMMON, mage.cards.p.PheresBandThunderhoof.class));
        cards.add(new SetCardInfo("Pheres-Band Warchief", 135, Rarity.RARE, mage.cards.p.PheresBandWarchief.class));
        cards.add(new SetCardInfo("Pin to the Earth", 45, Rarity.COMMON, mage.cards.p.PinToTheEarth.class));
        cards.add(new SetCardInfo("Polymorphous Rush", 46, Rarity.RARE, mage.cards.p.PolymorphousRush.class));
        cards.add(new SetCardInfo("Prophetic Flamespeaker", 106, Rarity.MYTHIC, mage.cards.p.PropheticFlamespeaker.class));
        cards.add(new SetCardInfo("Pull from the Deep", 47, Rarity.UNCOMMON, mage.cards.p.PullFromTheDeep.class));
        cards.add(new SetCardInfo("Quarry Colossus", 22, Rarity.UNCOMMON, mage.cards.q.QuarryColossus.class));
        cards.add(new SetCardInfo("Ravenous Leucrocota", 136, Rarity.COMMON, mage.cards.r.RavenousLeucrocota.class));
        cards.add(new SetCardInfo("Renowned Weaver", 137, Rarity.COMMON, mage.cards.r.RenownedWeaver.class));
        cards.add(new SetCardInfo("Reprisal", 23, Rarity.UNCOMMON, mage.cards.r.Reprisal.class));
        cards.add(new SetCardInfo("Returned Reveler", 79, Rarity.COMMON, mage.cards.r.ReturnedReveler.class));
        cards.add(new SetCardInfo("Revel of the Fallen God", 155, Rarity.RARE, mage.cards.r.RevelOfTheFallenGod.class));
        cards.add(new SetCardInfo("Reviving Melody", 138, Rarity.UNCOMMON, mage.cards.r.RevivingMelody.class));
        cards.add(new SetCardInfo("Riddle of Lightning", 107, Rarity.UNCOMMON, mage.cards.r.RiddleOfLightning.class));
        cards.add(new SetCardInfo("Riptide Chimera", 48, Rarity.UNCOMMON, mage.cards.r.RiptideChimera.class));
        cards.add(new SetCardInfo("Rise of Eagles", 49, Rarity.COMMON, mage.cards.r.RiseOfEagles.class));
        cards.add(new SetCardInfo("Ritual of the Returned", 80, Rarity.UNCOMMON, mage.cards.r.RitualOfTheReturned.class));
        cards.add(new SetCardInfo("Rollick of Abandon", 108, Rarity.UNCOMMON, mage.cards.r.RollickOfAbandon.class));
        cards.add(new SetCardInfo("Rotted Hulk", 81, Rarity.COMMON, mage.cards.r.RottedHulk.class));
        cards.add(new SetCardInfo("Rouse the Mob", 109, Rarity.COMMON, mage.cards.r.RouseTheMob.class));
        cards.add(new SetCardInfo("Sage of Hours", 50, Rarity.MYTHIC, mage.cards.s.SageOfHours.class));
        cards.add(new SetCardInfo("Satyr Grovedancer", 139, Rarity.COMMON, mage.cards.s.SatyrGrovedancer.class));
        cards.add(new SetCardInfo("Satyr Hoplite", 110, Rarity.COMMON, mage.cards.s.SatyrHoplite.class));
        cards.add(new SetCardInfo("Scourge of Fleets", 51, Rarity.RARE, mage.cards.s.ScourgeOfFleets.class));
        cards.add(new SetCardInfo("Setessan Tactics", 140, Rarity.RARE, mage.cards.s.SetessanTactics.class));
        cards.add(new SetCardInfo("Sightless Brawler", 24, Rarity.UNCOMMON, mage.cards.s.SightlessBrawler.class));
        cards.add(new SetCardInfo("Sigiled Skink", 111, Rarity.COMMON, mage.cards.s.SigiledSkink.class));
        cards.add(new SetCardInfo("Sigiled Starfish", 52, Rarity.COMMON, mage.cards.s.SigiledStarfish.class));
        cards.add(new SetCardInfo("Silence the Believers", 82, Rarity.RARE, mage.cards.s.SilenceTheBelievers.class));
        cards.add(new SetCardInfo("Skybind", 25, Rarity.RARE, mage.cards.s.Skybind.class));
        cards.add(new SetCardInfo("Skyspear Cavalry", 26, Rarity.UNCOMMON, mage.cards.s.SkyspearCavalry.class));
        cards.add(new SetCardInfo("Solidarity of Heroes", 141, Rarity.UNCOMMON, mage.cards.s.SolidarityOfHeroes.class));
        cards.add(new SetCardInfo("Spawn of Thraxes", 112, Rarity.RARE, mage.cards.s.SpawnOfThraxes.class));
        cards.add(new SetCardInfo("Spirespine", 142, Rarity.UNCOMMON, mage.cards.s.Spirespine.class));
        cards.add(new SetCardInfo("Spiteful Blow", 83, Rarity.UNCOMMON, mage.cards.s.SpitefulBlow.class));
        cards.add(new SetCardInfo("Spite of Mogis", 113, Rarity.UNCOMMON, mage.cards.s.SpiteOfMogis.class));
        cards.add(new SetCardInfo("Squelching Leeches", 84, Rarity.UNCOMMON, mage.cards.s.SquelchingLeeches.class));
        cards.add(new SetCardInfo("Starfall", 114, Rarity.COMMON, mage.cards.s.Starfall.class));
        cards.add(new SetCardInfo("Stonewise Fortifier", 27, Rarity.COMMON, mage.cards.s.StonewiseFortifier.class));
        cards.add(new SetCardInfo("Stormchaser Chimera", 156, Rarity.UNCOMMON, mage.cards.s.StormchaserChimera.class));
        cards.add(new SetCardInfo("Strength from the Fallen", 143, Rarity.UNCOMMON, mage.cards.s.StrengthFromTheFallen.class));
        cards.add(new SetCardInfo("Supply-Line Cranes", 28, Rarity.COMMON, mage.cards.s.SupplyLineCranes.class));
        cards.add(new SetCardInfo("Swarmborn Giant", 144, Rarity.UNCOMMON, mage.cards.s.SwarmbornGiant.class));
        cards.add(new SetCardInfo("Temple of Epiphany", 164, Rarity.RARE, mage.cards.t.TempleOfEpiphany.class));
        cards.add(new SetCardInfo("Temple of Malady", 165, Rarity.RARE, mage.cards.t.TempleOfMalady.class));
        cards.add(new SetCardInfo("Tethmos High Priest", 29, Rarity.UNCOMMON, mage.cards.t.TethmosHighPriest.class));
        cards.add(new SetCardInfo("Thassa's Devourer", 53, Rarity.COMMON, mage.cards.t.ThassasDevourer.class));
        cards.add(new SetCardInfo("Thassa's Ire", 54, Rarity.UNCOMMON, mage.cards.t.ThassasIre.class));
        cards.add(new SetCardInfo("Thoughtrender Lamia", 85, Rarity.UNCOMMON, mage.cards.t.ThoughtrenderLamia.class));
        cards.add(new SetCardInfo("Tormented Thoughts", 86, Rarity.UNCOMMON, mage.cards.t.TormentedThoughts.class));
        cards.add(new SetCardInfo("Triton Cavalry", 55, Rarity.UNCOMMON, mage.cards.t.TritonCavalry.class));
        cards.add(new SetCardInfo("Triton Shorestalker", 56, Rarity.COMMON, mage.cards.t.TritonShorestalker.class));
        cards.add(new SetCardInfo("Twinflame", 115, Rarity.RARE, mage.cards.t.Twinflame.class));
        cards.add(new SetCardInfo("Underworld Coinsmith", 157, Rarity.UNCOMMON, mage.cards.u.UnderworldCoinsmith.class));
        cards.add(new SetCardInfo("War-Wing Siren", 57, Rarity.COMMON, mage.cards.w.WarWingSiren.class));
        cards.add(new SetCardInfo("Whitewater Naiads", 58, Rarity.UNCOMMON, mage.cards.w.WhitewaterNaiads.class));
        cards.add(new SetCardInfo("Wildfire Cerberus", 116, Rarity.UNCOMMON, mage.cards.w.WildfireCerberus.class));
        cards.add(new SetCardInfo("Worst Fears", 87, Rarity.MYTHIC, mage.cards.w.WorstFears.class));
    }

}
