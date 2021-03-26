package cherokee.dictionary.word.prefixes

import cherokee.conjugation.verbal.containers.VerbPrefixTableObject
import cherokee.conjugation.verbal.containers.VerbPrefixTableSubject
import cherokee.conjugation.verbal.enums.Tense
import cherokee.dictionary.testutils.BaseTest
import cherokee.conjugation.verbal.Verb
import net.cherokeedictionary.transliteration.SyllabaryUtil

//these tests are only to check the prefix pieces and not the verb conjugation itself
//pp 252-254 Durbin Feeling Dictionary
class YiVerbTest extends BaseTest {
    public void testVerbDi() {
        Verb verb = new Verb()
        verb.verbSubject = VerbPrefixTableSubject.SG1
        verb.verbObject = VerbPrefixTableObject.SG2
        verb.tense = Tense.PRESENT
        verb.initialPrefix.with {yi = true}
        verb.verbRootLatinPhonetic = "gowati"
        verb.verbRootSuffixLatinPhonetic = "h"
        verb.finalSuffix.with {a = true}

        verb.pronounPrefixLatin = "a"
        verb.pronounPrefixSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.pronounPrefixLatin)
        verb.verbRootSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.verbRootLatinPhonetic)

        basicAssertion(verb, SyllabaryUtil.tsalagiToSyllabary("yagowatiha"))

        verb.verbRootLatinPhonetic = "gowati"
        verb.verbRootSuffixLatinPhonetic = "h"

        verb.pronounPrefixLatin = "ji"
        verb.pronounPrefixSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.pronounPrefixLatin)
        verb.verbRootSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.verbRootLatinPhonetic)

        basicAssertion(verb, SyllabaryUtil.tsalagiToSyllabary("yijigowatiha"))

        verb.verbRootLatinPhonetic = "gowati"
        verb.verbRootSuffixLatinPhonetic = "h"

        verb.pronounPrefixLatin = "wa"
        verb.pronounPrefixSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.pronounPrefixLatin)
        verb.verbRootSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.verbRootLatinPhonetic)

        basicAssertion(verb, SyllabaryUtil.tsalagiToSyllabary("yuwagowatiha"))

        verb.verbRootLatinPhonetic = "gowati"
        verb.verbRootSuffixLatinPhonetic = "h"

        verb.pronounPrefixLatin = "hi"
        verb.pronounPrefixSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.pronounPrefixLatin)
        verb.verbRootSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.verbRootLatinPhonetic)

        basicAssertion(verb, SyllabaryUtil.tsalagiToSyllabary("yigowatiha"))

        verb.verbRootLatinPhonetic = "woni"
        verb.verbRootSuffixLatinPhonetic = "h"

        verb.pronounPrefixLatin = "ga"
        verb.pronounPrefixSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.pronounPrefixLatin)
        verb.verbRootSyllabary = SyllabaryUtil.tsalagiToSyllabary(verb.verbRootLatinPhonetic)

        basicAssertion(verb, SyllabaryUtil.tsalagiToSyllabary("yigawoniha"))
    }
}
