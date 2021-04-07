package cherokee.conjugation.verbal

import net.cherokeedcitionary.verbal.stemming.DefinitionLine
import net.cherokeedcitionary.verbal.stemming.Stemmer


class ConjugatePastTense extends ConjugateBase {
    static def heSeesIt = new Stemmer()

    static def dnm = "FAILURE DID NOT MATCH"
    static {
        heSeesIt.habitual = new DefinitionLine(syllabary: "ᎠᎪᏩᏘᏍᎪᎢ")
        heSeesIt.imperative = new DefinitionLine(syllabary: "ᎯᎪᏩᏔ")
        heSeesIt.infinitive = new DefinitionLine(syllabary: "ᎤᎪᏩᏛᏗ")
        heSeesIt.present1st = new DefinitionLine(syllabary: "ᏥᎪᏩᏘᎭ")
        heSeesIt.present3rd = new DefinitionLine(syllabary: "ᎠᎪᏩᏘᎭ")
        heSeesIt.remotepast = new DefinitionLine(syllabary: "ᎤᎪᎲᎢ")
    }
    public void test() {
//        assertEquals(DNM, "ᏥᎪᏩᏘᏍᎬᎢ", conjPast("SG1", "SG3AN"))
    }

    private String conjPast(subj, obj) {
//        Conjugate conjugate = new Conjugate()
//        //stemmer failure -- need to fix
//        return conjugate.conjugate(subj, obj, heSeesIt, Tense.REMOTE_PAST.toString(), "v.t.")
    }
}
