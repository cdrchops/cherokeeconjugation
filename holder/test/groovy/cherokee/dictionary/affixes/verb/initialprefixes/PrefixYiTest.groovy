package cherokee.dictionary.affixes.verb.initialprefixes

import cherokee.conjugation.verbal.containers.VerbPrefixTableObject
import cherokee.conjugation.verbal.containers.VerbPrefixTableSubject
import cherokee.conjugation.verbal.enums.Tense
import cherokee.dictionary.conjugation.ConjugateBase
import cherokee.conjugation.verbal.Verb
import net.cherokeedictionary.transliteration.SyllabaryUtil

class PrefixYiTest extends ConjugateBase {
    private Verb generateBaseVerb() {
        Verb verb = new Verb()
        verb.verbSubject = VerbPrefixTableSubject.SG3
        verb.verbObject = VerbPrefixTableObject.DL2
        verb.tense = Tense.PRESENT
        verb.verbRootLatinPhonetic = "gowati"
        verb.verbRootSuffixLatinPhonetic = "h"
        verb.finalSuffix.with {a = true}
        verb.initialPrefix.e = false
        verb.pronounPrefixLatin = "sdi"
        verb.pronounPrefixSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.pronounPrefixLatin)
        verb.verbRootSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.verbRootLatinPhonetic)

        return verb
    }

    public void testPrefixYi() {
        Verb v = generateBaseVerb()

    }
}
