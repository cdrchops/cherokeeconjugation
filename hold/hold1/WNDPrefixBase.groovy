package cherokee.dictionary.verb.conjugation.hold

import cherokee.dictionary.conjugation.Conjugate
import cherokee.dictionary.conjugation.cdpbook.Stemmer
import cherokee.dictionary.conjugation.stem.DefinitionLine

/**
 * Created by torr on 10/21/2015.
 */
class WNDPrefixBase extends GroovyTestCase {
    static def dadahnesea = new Stemmer()
    static def dadanilvga = new Stemmer()
    static def dadeyohvsga = new Stemmer()
    static def dagvwahldiha = new Stemmer()
    static def dahlilosdiha = new Stemmer()
    static def dahnawaiyva = new Stemmer()
    static def dahnawoa = new Stemmer()
    static def dahvtvsga = new Stemmer()
    static def dahyvgia = new Stemmer()
    static def dakanehiha = new Stemmer()
    static def dakanehyiha = new Stemmer()
    static def dakanowadidoha = new Stemmer()
    static def daksvsdiha = new Stemmer()
    static def daktilega = new Stemmer()
    static def daktinvdea = new Stemmer()
    static def daktinvtvsga = new Stemmer()
    static def daktliha = new Stemmer()
    static def dakwayovsga = new Stemmer()
    static def dalasuhlvsga = new Stemmer()
    static def dalasulaiyva = new Stemmer()
    static def dalasulea = new Stemmer()
    static def dalehdiha = new Stemmer()
    static def daliyesulea = new Stemmer()
    static def daliyesulia = new Stemmer()
    static def daliyogia = new Stemmer()
    static def daliyohia = new Stemmer()
    static def daliyosiha = new Stemmer()
    static def dalsosdiha = new Stemmer()
    static def danadlosga = new Stemmer()
    static def danehldiha = new Stemmer()
    static def danelohvsga = new Stemmer()
    static def daniyelisga = new Stemmer()
    static def dasdayohiha = new Stemmer()
    static def dasdlusga = new Stemmer()
    static def dasdudlia = new Stemmer()
    static def dasehiha = new Stemmer()
    static def dasginadia = new Stemmer()
    static def dasihtvniha = new Stemmer()
    static def dasvsdiha = new Stemmer()
    static def datesga = new Stemmer()
    static def dayosga = new Stemmer()
    static def degalvdvnisdiha = new Stemmer()
    static def deganadiwsga = new Stemmer()
    static def deganojahlvsga = new Stemmer()
    static def degasohga = new Stemmer()
    static def degetvsga = new Stemmer()
    static def degosisiha = new Stemmer()
    static def degukdiha = new Stemmer()
    static def degvdiyea = new Stemmer()
    static def degvtohia = new Stemmer()
    static def dekalihgwadega = new Stemmer()
    static def dekanogia = new Stemmer()
    static def dekanugosga = new Stemmer()
    static def dekgiloa = new Stemmer()
    static def dudlosga = new Stemmer()
    static def dudoa = new Stemmer()
    static def duktinvta = new Stemmer()
    static def dusgalesdiha = new Stemmer()
    static def nuwanhdi = new Stemmer()
    static def wadia = new Stemmer()
    static def wahvsga = new Stemmer()
    static def wakti = new Stemmer()
    static def wigakahvsga = new Stemmer()
    static def wiganehvsga = new Stemmer()
    static def wiganvvsga = new Stemmer()
    static def wudeliga = new Stemmer()

    static {
        dadahnesea.habitual = new DefinitionLine ( syllabary: "ᏓᏓᏁᏎᏍᎪᎢ" )
        dadahnesea.imperative = new DefinitionLine ( syllabary: "ᏔᏓᏁᏌᎦ" )
        dadahnesea.infinitive = new DefinitionLine ( syllabary: "ᏧᏓᏁᏎᏍᏗ" )
        dadahnesea.present1st = new DefinitionLine ( syllabary: "ᏕᎦᏓᏁᏎᎠ" )
        dadahnesea.present3rd = new DefinitionLine ( syllabary: "ᏓᏓᏁᏍᏎᎠ" )
        dadahnesea.remotepast = new DefinitionLine ( syllabary: "ᏚᏓᏁᏌᎥᎢ" )
        dadanilvga.habitual = new DefinitionLine ( syllabary: "ᏓᏓᏂᎸᎪᎢ" )
        dadanilvga.imperative = new DefinitionLine ( syllabary: "ᏘᏯᏓᏂᎸᎩ" )
        dadanilvga.infinitive = new DefinitionLine ( syllabary: "ᏧᏓᏂᎸᏍᏗ" )
        dadanilvga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏯᏓᏂᎸᎦ" )
        dadanilvga.present3rd = new DefinitionLine ( syllabary: "ᏓᏓᏂᎸᎦ" )
        dadanilvga.remotepast = new DefinitionLine ( syllabary: "ᏚᏓᏂᎸᏨᎢ" )
        dadeyohvsga.habitual = new DefinitionLine ( syllabary: "ᏓᏕᏲᎲᏍᎪᎢ" )
        dadeyohvsga.imperative = new DefinitionLine ( syllabary: "ᏔᏕᏲᎲᎦ" )
        dadeyohvsga.infinitive = new DefinitionLine ( syllabary: "ᏧᏕᏲᏗ" )
        dadeyohvsga.present1st = new DefinitionLine ( syllabary: "ᏕᎦᏕᏲᎲᏍᎦ" )
        dadeyohvsga.present3rd = new DefinitionLine ( syllabary: "ᏓᏕᏲᎲᏍᎦ" )
        dadeyohvsga.remotepast = new DefinitionLine ( syllabary: "ᏚᏕᏲᏅᎢ" )
        dagvwahldiha.habitual = new DefinitionLine ( syllabary: "ᏓᎬᏩᎶᏗᏍᎪᎢ" )
        dagvwahldiha.imperative = new DefinitionLine ( syllabary: "ᏘᎬᏩᎶᏓ" )
        dagvwahldiha.infinitive = new DefinitionLine ( syllabary: "ᏧᎬᏩᎶᏙᏗ" )
        dagvwahldiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎬᏩᎶᏗᎭ" )
        dagvwahldiha.present3rd = new DefinitionLine ( syllabary: "ᏓᎬᏩᎶᏗᎭ" )
        dagvwahldiha.remotepast = new DefinitionLine ( syllabary: "ᏚᎬᏩᎶᏔᏅᎢ" )
        dahlilosdiha.habitual = new DefinitionLine ( syllabary: "ᏓᏟᎶᏍᏗᏍᎪᎢ" )
        dahlilosdiha.imperative = new DefinitionLine ( syllabary: "ᏘᏯᏟᎶᏍᏓ, ᏔᏟᎶᏍᏓ" )
        dahlilosdiha.infinitive = new DefinitionLine ( syllabary: "ᏧᏟᎶᏍᏙᏗ" )
        dahlilosdiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏯᏟᎶᏍᏗᎭ, ᏕᎦᏟᎶᏍᏗᎠ" )
        dahlilosdiha.present3rd = new DefinitionLine ( syllabary: "ᏓᏟᎶᏍᏗᎭ" )
        dahlilosdiha.remotepast = new DefinitionLine ( syllabary: "ᏚᏟᎶᏍᏔᏅᎢ" )
        dahnawaiyva.habitual = new DefinitionLine ( syllabary: "ᏓᎿᏩᎢᏴᏍᎪᎢ" )
        dahnawaiyva.imperative = new DefinitionLine ( syllabary: "ᏔᎿᏩᎢᏴᎾ" )
        dahnawaiyva.infinitive = new DefinitionLine ( syllabary: "ᏧᎿᏩᎢᏴᏍᏗ" )
        dahnawaiyva.present1st = new DefinitionLine ( syllabary: "ᏕᎦᏂᏩᎢᏴᎠ" )
        dahnawaiyva.present3rd = new DefinitionLine ( syllabary: "ᏓᎿᏩᎢᏴᎠ" )
        dahnawaiyva.remotepast = new DefinitionLine ( syllabary: "ᏚᎿᏩᎢᏴᏒᎢ" )
        dahnawoa.habitual = new DefinitionLine ( syllabary: "ᏓᎿᏬᏍᎪᎢ" )
        dahnawoa.imperative = new DefinitionLine ( syllabary: "ᏔᎿᏬᏣ" )
        dahnawoa.infinitive = new DefinitionLine ( syllabary: "ᏧᎿᏬᏍᏗ" )
        dahnawoa.present1st = new DefinitionLine ( syllabary: "ᏕᎦᏂᏬᎠ" )
        dahnawoa.present3rd = new DefinitionLine ( syllabary: "ᏓᎿᏬᎠ" )
        dahnawoa.remotepast = new DefinitionLine ( syllabary: "ᏚᎿᏬᎤᎢ" )
        dahvtvsga.habitual = new DefinitionLine ( syllabary: "ᏓᎲᏛᏍᎪᎢ" )
        dahvtvsga.imperative = new DefinitionLine ( syllabary: "ᏘᎲᏛᎦ" )
        dahvtvsga.infinitive = new DefinitionLine ( syllabary: "ᏧᎲᏘᏗ" )
        dahvtvsga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎥᏛᏍᎦ" )
        dahvtvsga.present3rd = new DefinitionLine ( syllabary: "ᏓᎲᏨᎦ" )
        dahvtvsga.remotepast = new DefinitionLine ( syllabary: "ᏚᎲᏔᏅᎢ" )
        dahyvgia.habitual = new DefinitionLine ( syllabary: "ᏓᏴᎩᏍᎪᎢ" )
        dahyvgia.imperative = new DefinitionLine ( syllabary: "ᏘᏴᎦ" )
        dahyvgia.infinitive = new DefinitionLine ( syllabary: "ᏧᏴᎩᏍᏗ" )
        dahyvgia.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏴᎩᎠ" )
        dahyvgia.present3rd = new DefinitionLine ( syllabary: "ᏓᏴᎩᎠ" )
        dahyvgia.remotepast = new DefinitionLine ( syllabary: "ᏚᏴᎬᎢ" )
        dakanehiha.habitual = new DefinitionLine ( syllabary: "ᏓᎧᏁᎯᎰᎢ" )
        dakanehiha.imperative = new DefinitionLine ( syllabary: "ᏘᎧᏁᎦ" )
        dakanehiha.infinitive = new DefinitionLine ( syllabary: "ᏧᎧᏁᏍᏗ" )
        dakanehiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎦᏁᎯᎭ" )
        dakanehiha.present3rd = new DefinitionLine ( syllabary: "ᏓᎧᏁᎯᎭ" )
        dakanehiha.remotepast = new DefinitionLine ( syllabary: "ᏚᎧᏁᏢᎢ" )
        dakanehyiha.habitual = new DefinitionLine ( syllabary: "ᏓᎧᏁᏱᏍᎪᎢ" )
        dakanehyiha.imperative = new DefinitionLine ( syllabary: "ᏘᎧᏁᏯ" )
        dakanehyiha.infinitive = new DefinitionLine ( syllabary: "ᏧᎧᏁᏴᏗ" )
        dakanehyiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎦᏁᏲᎭ" )
        dakanehyiha.present3rd = new DefinitionLine ( syllabary: "ᏓᎧᏁᏱᎭ" )
        dakanehyiha.remotepast = new DefinitionLine ( syllabary: "ᏚᎧᏁᏴᎲᎢ" )
        dakanowadidoha.habitual = new DefinitionLine ( syllabary: "ᏓᎧᏃᏩᏗᏙᎰᎢ" )
        dakanowadidoha.imperative = new DefinitionLine ( syllabary: "ᏘᎦᏃᏩᏗᏓ" )
        dakanowadidoha.infinitive = new DefinitionLine ( syllabary: "ᏧᎧᏃᏩᏗᏓᏍᏗ" )
        dakanowadidoha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎦᏃᏩᏗᏙᎭ" )
        dakanowadidoha.present3rd = new DefinitionLine ( syllabary: "ᏓᎧᏃᏩᏗᏙᎭ" )
        dakanowadidoha.remotepast = new DefinitionLine ( syllabary: "ᏚᎧᏃᏩᏗᏙᎸᎢ" )
        daksvsdiha.habitual = new DefinitionLine ( syllabary: "ᏓᎦᏒᏍᏗᏍᎪᎢ" )
        daksvsdiha.imperative = new DefinitionLine ( syllabary: "ᏘᎦᏒᏍᏓ" )
        daksvsdiha.infinitive = new DefinitionLine ( syllabary: "ᏧᎦᏒᏍᏙᏗ" )
        daksvsdiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎦᏒᏍᏗᎭ" )
        daksvsdiha.present3rd = new DefinitionLine ( syllabary: "ᏓᎦᏒᏍᏗᎭ" )
        daksvsdiha.remotepast = new DefinitionLine ( syllabary: "ᏚᎦᏒᏍᏔᏅᎢ" )
        daktilega.habitual = new DefinitionLine ( syllabary: "ᏓᎦᏘᎴᎪᎢ" )
        daktilega.imperative = new DefinitionLine ( syllabary: "ᏘᎦᏘᎷᎦ, ᏘᎦᏘᎷᎦ" )
        daktilega.infinitive = new DefinitionLine ( syllabary: "ᏧᎦᏘᎸᏍᏗ" )
        daktilega.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎦᏘᎴᎦ, ᏕᏥᎦᏘᎴᎦ" )
        daktilega.present3rd = new DefinitionLine ( syllabary: "ᏓᎦᏘᎴᎦ" )
        daktilega.remotepast = new DefinitionLine ( syllabary: "ᏚᎦᏘᎸᏒᎢ" )
        daktinvdea.habitual = new DefinitionLine ( syllabary: "ᏓᎦᏘᏅᏕᏍᎪᎢ" )
        daktinvdea.imperative = new DefinitionLine ( syllabary: "ᏔᎦᏘᏅᏓᎩ" )
        daktinvdea.infinitive = new DefinitionLine ( syllabary: "ᏧᎦᏘᏅᏕᏍᏗ" )
        daktinvdea.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎦᏘᏅᏕᎠ" )
        daktinvdea.present3rd = new DefinitionLine ( syllabary: "ᏓᎦᏘᏅᏕᎠ" )
        daktinvdea.remotepast = new DefinitionLine ( syllabary: "ᏚᎦᏘᏅᏕᏒᎢ" )
        daktinvtvsga.habitual = new DefinitionLine ( syllabary: "ᏓᎦᏘᏅᏛᏍᎪᎢ" )
        daktinvtvsga.imperative = new DefinitionLine ( syllabary: "ᏔᎦᏘᏅᏛᎦ" )
        daktinvtvsga.infinitive = new DefinitionLine ( syllabary: "ᏧᎦᏘᏅᏘᏗ" )
        daktinvtvsga.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎦᏘᏅᏛᏍᎦ" )
        daktinvtvsga.present3rd = new DefinitionLine ( syllabary: "ᏓᎦᏘᏅᏛᏍᎦ" )
        daktinvtvsga.remotepast = new DefinitionLine ( syllabary: "ᏚᎦᏘᏅᏔᏅᎢ" )
        daktliha.habitual = new DefinitionLine ( syllabary: "ᏓᎦᏟᏍᎪᎢ" )
        daktliha.imperative = new DefinitionLine ( syllabary: "ᏘᎦᏝ" )
        daktliha.infinitive = new DefinitionLine ( syllabary: "ᏧᎦᏢᏗ" )
        daktliha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎦᏟᎭ" )
        daktliha.present3rd = new DefinitionLine ( syllabary: "ᏓᎦᏟᎭ" )
        daktliha.remotepast = new DefinitionLine ( syllabary: "ᏚᎦᏢᎲᎢ" )
        dakwayovsga.habitual = new DefinitionLine ( syllabary: "ᏓᏆᏲᎥᏍᎪᎢ" )
        dakwayovsga.imperative = new DefinitionLine ( syllabary: "ᏘᏆᏲᎥᎦ" )
        dakwayovsga.infinitive = new DefinitionLine ( syllabary: "ᏧᏆᏲᏗ" )
        dakwayovsga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏆᏲᎥᏍᎦ" )
        dakwayovsga.present3rd = new DefinitionLine ( syllabary: "ᏓᏆᏲᎥᏍᎦ" )
        dakwayovsga.remotepast = new DefinitionLine ( syllabary: "ᏚᏆᏲᏅᎢ" )
        dalasuhlvsga.habitual = new DefinitionLine ( syllabary: "ᏓᎳᏑᏢᏍᎪᎢ" )
        dalasuhlvsga.imperative = new DefinitionLine ( syllabary: "ᏔᎳᏑᏢᎦ" )
        dalasuhlvsga.infinitive = new DefinitionLine ( syllabary: "ᏧᎳᏑᏢᏗ" )
        dalasuhlvsga.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎳᏑᏢᏍᎦ" )
        dalasuhlvsga.present3rd = new DefinitionLine ( syllabary: "ᏓᎳᏑᏢᏍᎦ" )
        dalasuhlvsga.remotepast = new DefinitionLine ( syllabary: "ᏚᎳᏑᏝᏅᎢ" )
        dalasulaiyva.habitual = new DefinitionLine ( syllabary: "ᏓᎳᏑᎳᎢᏴᏍᎪᎢ" )
        dalasulaiyva.imperative = new DefinitionLine ( syllabary: "ᏔᎳᏑᎳᎢᏴᎾ" )
        dalasulaiyva.infinitive = new DefinitionLine ( syllabary: "ᏧᎳᏑᎳᎢᏴᏍᏗ" )
        dalasulaiyva.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎳᏑᎳᎢᏴᎠ" )
        dalasulaiyva.present3rd = new DefinitionLine ( syllabary: "ᏓᎳᏑᎳᎢᏴᎠ" )
        dalasulaiyva.remotepast = new DefinitionLine ( syllabary: "ᏚᎳᏑᎳᎢᏴᏒᎢ" )
        dalasulea.habitual = new DefinitionLine ( syllabary: "ᏓᎳᏑᎴᏍᎪᎢ" )
        dalasulea.imperative = new DefinitionLine ( syllabary: "ᏔᎳᏑᎳᎩ" )
        dalasulea.infinitive = new DefinitionLine ( syllabary: "ᏧᎳᏑᎴᏍᏗ" )
        dalasulea.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎳᏑᎴᎠ" )
        dalasulea.present3rd = new DefinitionLine ( syllabary: "ᏓᎳᏑᎴᎠ" )
        dalasulea.remotepast = new DefinitionLine ( syllabary: "ᏚᎳᏑᎴᏒᎢ" )
        dalehdiha.habitual = new DefinitionLine ( syllabary: "ᏓᎴᏗᏍᎪᎢ" )
        dalehdiha.imperative = new DefinitionLine ( syllabary: "ᏘᏯᎴᏓ, ᏔᎴᏓ" )
        dalehdiha.infinitive = new DefinitionLine ( syllabary: "ᏧᎴᏙᏗ" )
        dalehdiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏯᎴᏗᎭ, ᏕᎦᎴᏗᎭ" )
        dalehdiha.present3rd = new DefinitionLine ( syllabary: "ᏓᎴᏗᎭ" )
        dalehdiha.remotepast = new DefinitionLine ( syllabary: "ᏚᎴᏔᏅᎢ" )
        daliyesulea.habitual = new DefinitionLine ( syllabary: "ᏓᎵᏰᏑᎴᏍᎪᎢ " )
        daliyesulea.imperative = new DefinitionLine ( syllabary: "ᏔᎵᏰᏑᎳᎩ" )
        daliyesulea.infinitive = new DefinitionLine ( syllabary: "ᏧᎵᏰᏑᎴᏍᏗ" )
        daliyesulea.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎵᏰᏑᎴᎠ" )
        daliyesulea.present3rd = new DefinitionLine ( syllabary: "ᏓᎴᏰᏑᎴᎠ" )
        daliyesulea.remotepast = new DefinitionLine ( syllabary: "ᏚᎵᏰᏑᎴᏒᎢ" )
        daliyesulia.habitual = new DefinitionLine ( syllabary: "ᏓᎵᏰᏑᎵᏍᎪᎢ" )
        daliyesulia.imperative = new DefinitionLine ( syllabary: "ᏔᎵᏰᏑᎸᎦ" )
        daliyesulia.infinitive = new DefinitionLine ( syllabary: "ᏧᎵᏰᏑᎶᏗ" )
        daliyesulia.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎵᏰᏑᎵᎠ" )
        daliyesulia.present3rd = new DefinitionLine ( syllabary: "ᏓᎵᏰᏑᎵᎠ" )
        daliyesulia.remotepast = new DefinitionLine ( syllabary: "ᏚᎵᏰᏑᎳᏅᎢ" )
        daliyogia.habitual = new DefinitionLine ( syllabary: "ᏓᎵᏲᎩᏍᎪᎢ" )
        daliyogia.imperative = new DefinitionLine ( syllabary: "ᏔᎵᏲᎩ" )
        daliyogia.infinitive = new DefinitionLine ( syllabary: "ᏧᎵᏲᎩᏍᏗ" )
        daliyogia.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎵᏲᎩᎠ" )
        daliyogia.present3rd = new DefinitionLine ( syllabary: "ᏓᎵᏲᎩᎠ" )
        daliyogia.remotepast = new DefinitionLine ( syllabary: "ᏚᎵᏲᎩᏒᎢ" )
        daliyohia.habitual = new DefinitionLine ( syllabary: "ᏓᎵᏲᎯᎰᎢ" )
        daliyohia.imperative = new DefinitionLine ( syllabary: "ᏔᎵᏲᎦ" )
        daliyohia.infinitive = new DefinitionLine ( syllabary: "ᏧᎵᏲᏍᏗ" )
        daliyohia.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎵᏲᎢᎭ" )
        daliyohia.present3rd = new DefinitionLine ( syllabary: "ᏓᎵᏲᎯᎠ" )
        daliyohia.remotepast = new DefinitionLine ( syllabary: "ᏚᎵᏲᏢᎢ" )
        daliyosiha.habitual = new DefinitionLine ( syllabary: "ᏓᎵᏲᏏᎰᎢ" )
        daliyosiha.imperative = new DefinitionLine ( syllabary: "ᏔᎵᏲᏌ" )
        daliyosiha.infinitive = new DefinitionLine ( syllabary: "ᏧᎶᏲᏒᏗ" )
        daliyosiha.present1st = new DefinitionLine ( syllabary: "ᏕᎦᎵᏲᏏᎭ" )
        daliyosiha.present3rd = new DefinitionLine ( syllabary: "ᏓᎵᏲᏏᎭ" )
        daliyosiha.remotepast = new DefinitionLine ( syllabary: "ᏚᎵᏲᏒᎲᎢ" )
        dalsosdiha.habitual = new DefinitionLine ( syllabary: "ᏓᎵᏐᏍᏗᏍᎪᎢ" )
        dalsosdiha.imperative = new DefinitionLine ( syllabary: "ᏘᏯᎵᏐᏍᏓ, ᏔᎵᏐᏍᏓ" )
        dalsosdiha.infinitive = new DefinitionLine ( syllabary: "ᏧᎵᏐᏍᏙᏗ" )
        dalsosdiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏯᎵᏐᏍᏗᎭ, ᏕᎦᎵᏐᏍᏗᎭ " )
        dalsosdiha.present3rd = new DefinitionLine ( syllabary: "ᏓᎵᏐᏍᏗᎭ" )
        dalsosdiha.remotepast = new DefinitionLine ( syllabary: "ᏚᎵᏐᏍᏔᏅᎢ" )
        danadlosga.habitual = new DefinitionLine ( syllabary: "ᏓᎾᏠᏍᎪᎢ" )
        danadlosga.imperative = new DefinitionLine ( syllabary: "ᏗᏣᏠᎯ" )
        danadlosga.infinitive = new DefinitionLine ( syllabary: "ᏧᎾᏠᎯᏍᏗ" )
        danadlosga.present1st = new DefinitionLine ( syllabary: "ᏙᏣᏠᏍᎦ" )
        danadlosga.present3rd = new DefinitionLine ( syllabary: "ᏓᎾᏠᏍᎦ" )
        danadlosga.remotepast = new DefinitionLine ( syllabary: "ᏚᎾᏠᏒᎢ" )
        danehldiha.habitual = new DefinitionLine ( syllabary: "ᏓᏁᎶᏗᏍᎪᎢ" )
        danehldiha.imperative = new DefinitionLine ( syllabary: "ᏘᏯᏁᎶᏓ, ᏔᏁᎶᏓ" )
        danehldiha.infinitive = new DefinitionLine ( syllabary: "ᏧᏁᎶᏙᏗ" )
        danehldiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏯᏁᎶᏗᎭ, ᏕᎦᏁᎶᏗᎭ" )
        danehldiha.present3rd = new DefinitionLine ( syllabary: "ᏓᏁᎶᏗᎭ" )
        danehldiha.remotepast = new DefinitionLine ( syllabary: "ᏚᏁᎶᏔᏅᎢ" )
        danelohvsga.habitual = new DefinitionLine ( syllabary: "ᏓᏁᎶᎲᏍᎪᎢ" )
        danelohvsga.imperative = new DefinitionLine ( syllabary: "ᏔᏁᎶᎲᎦ" )
        danelohvsga.infinitive = new DefinitionLine ( syllabary: "ᏧᏁᎶᏗ" )
        danelohvsga.present1st = new DefinitionLine ( syllabary: "ᏕᎦᏁᎶᎲᏍᎦ" )
        danelohvsga.present3rd = new DefinitionLine ( syllabary: "ᏓᏁᎶᎲᏍᎦ" )
        danelohvsga.remotepast = new DefinitionLine ( syllabary: "ᏚᏁᎶᏅᎢ" )
        daniyelisga.habitual = new DefinitionLine ( syllabary: "ᏓᏂᏰᎵᏍᎪᎢ" )
        daniyelisga.imperative = new DefinitionLine ( syllabary: "ᏗᏥᏰᎵᎯ" )
        daniyelisga.infinitive = new DefinitionLine ( syllabary: "ᏧᎯᏰᎵᎯᏍᏗ" )
        daniyelisga.present1st = new DefinitionLine ( syllabary: "ᏙᏥᏰᎵᏍᎦ" )
        daniyelisga.present3rd = new DefinitionLine ( syllabary: "ᏓᏂᏰᎵᏍᎦ" )
        daniyelisga.remotepast = new DefinitionLine ( syllabary: "ᏚᏂᏰᎵᏍᎦ" )
        dasdayohiha.habitual = new DefinitionLine ( syllabary: "ᏓᏍᏓᏲᎯᎰᎢ" )
        dasdayohiha.imperative = new DefinitionLine ( syllabary: "ᏘᏍᏓᏲᎭ, ᏘᏍᏓᏲᎭ" )
        dasdayohiha.infinitive = new DefinitionLine ( syllabary: "ᏧᏍᏓᏲᏍᏗ" )
        dasdayohiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏍᏓᏲᎯᎭ" )
        dasdayohiha.present3rd = new DefinitionLine ( syllabary: "ᏓᏍᏓᏲᎯᎭ" )
        dasdayohiha.remotepast = new DefinitionLine ( syllabary: "ᏚᏍᏓᏲᏢᎢ" )
        dasdlusga.habitual = new DefinitionLine ( syllabary: "ᏓᏍᏡᏍᎪᎢ" )
        dasdlusga.imperative = new DefinitionLine ( syllabary: "ᏘᏍᏡᏯ" )
        dasdlusga.infinitive = new DefinitionLine ( syllabary: "ᏧᏍᏡᏍᏗ" )
        dasdlusga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏍᏡᏍᎦ" )
        dasdlusga.present3rd = new DefinitionLine ( syllabary: "ᏓᏍᏡᏍᎦ" )
        dasdlusga.remotepast = new DefinitionLine ( syllabary: "ᏚᏍᏡᏴᎢ" )
        dasdudlia.habitual = new DefinitionLine ( syllabary: "ᏓᏍᏚᏟᏍᎪᎢ" )
        dasdudlia.imperative = new DefinitionLine ( syllabary: "ᏘᏍᏚᏜ" )
        dasdudlia.infinitive = new DefinitionLine ( syllabary: "ᏧᏍᏚᏟᏍᏗ" )
        dasdudlia.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏍᏚᏟᎠ" )
        dasdudlia.present3rd = new DefinitionLine ( syllabary: "ᏓᏍᏚᏟᎠ" )
        dasdudlia.remotepast = new DefinitionLine ( syllabary: "ᏚᏍᏚᏢᎢ" )
        dasehiha.habitual = new DefinitionLine ( syllabary: "ᏓᏎᎯᎰᎢ" )
        dasehiha.imperative = new DefinitionLine ( syllabary: "ᏔᏎᎦ" )
        dasehiha.infinitive = new DefinitionLine ( syllabary: "ᏧᏎᏍᏗ" )
        dasehiha.present1st = new DefinitionLine ( syllabary: "ᏕᎦᏎᎯᎭ" )
        dasehiha.present3rd = new DefinitionLine ( syllabary: "ᏓᏎᎯᎭ" )
        dasehiha.remotepast = new DefinitionLine ( syllabary: "ᏚᏎᏢᎢ" )
        dasginadia.habitual = new DefinitionLine ( syllabary: "ᏓᏍᎩᎾᏗᏍᎪᎢ" )
        dasginadia.imperative = new DefinitionLine ( syllabary: "ᏘᏍᎩᎾᏓ, ᏘᏍᎩᎾᏓ" )
        dasginadia.infinitive = new DefinitionLine ( syllabary: "ᏧᏍᎩᎾᏗᏍᏗ" )
        dasginadia.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏍᎩᎾᏗᎠ" )
        dasginadia.present3rd = new DefinitionLine ( syllabary: "ᏓᏍᎩᎾᏗᎠ" )
        dasginadia.remotepast = new DefinitionLine ( syllabary: "ᏚᏍᎩᎾᏛᎢ" )
        dasihtvniha.habitual = new DefinitionLine ( syllabary: "ᏓᏏᏛᏂᎰᎢ" )
        dasihtvniha.imperative = new DefinitionLine ( syllabary: "ᏔᏏᏛᏂᎦ" )
        dasihtvniha.infinitive = new DefinitionLine ( syllabary: "ᏧᏏᏛᏂᏍᏗ" )
        dasihtvniha.present1st = new DefinitionLine ( syllabary: "ᏕᎦᏏᏛᏂᎭ" )
        dasihtvniha.present3rd = new DefinitionLine ( syllabary: "ᏓᏏᏛᏂᎭ" )
        dasihtvniha.remotepast = new DefinitionLine ( syllabary: "ᏚᏏᏛᏂᎸᎢ" )
        dasvsdiha.habitual = new DefinitionLine ( syllabary: "ᏓᏒᏍᏗᏍᎪᎢ" )
        dasvsdiha.imperative = new DefinitionLine ( syllabary: "ᏘᏒᏍᏓ" )
        dasvsdiha.infinitive = new DefinitionLine ( syllabary: "ᏧᏒᏍᏙᏗ" )
        dasvsdiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏒᏍᏗᎭ" )
        dasvsdiha.present3rd = new DefinitionLine ( syllabary: "ᏓᏒᏍᏗᎭ" )
        dasvsdiha.remotepast = new DefinitionLine ( syllabary: "ᏚᏒᏍᏔᏅᎢ" )
        datesga.habitual = new DefinitionLine ( syllabary: "ᏓᏖᏍᎪᎢ" )
        datesga.imperative = new DefinitionLine ( syllabary: "ᏘᏛᎦ" )
        datesga.infinitive = new DefinitionLine ( syllabary: "ᏧᏖᏍᏗ" )
        datesga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏖᏍᎦ" )
        datesga.present3rd = new DefinitionLine ( syllabary: "ᏓᏖᏍᎦ" )
        datesga.remotepast = new DefinitionLine ( syllabary: "ᏚᏖᏒᎢ" )
        dayosga.habitual = new DefinitionLine ( syllabary: "ᏓᏲᏍᎪᎢ" )
        dayosga.imperative = new DefinitionLine ( syllabary: "ᏘᏲᎯ" )
        dayosga.infinitive = new DefinitionLine ( syllabary: "ᏧᏲᎯᏍᏗ" )
        dayosga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏲᏍᎦ" )
        dayosga.present3rd = new DefinitionLine ( syllabary: "ᏓᏲᏍᎦ" )
        dayosga.remotepast = new DefinitionLine ( syllabary: "ᏚᏲᏒᎢ" )
        degalvdvnisdiha.habitual = new DefinitionLine ( syllabary: "ᏕᎦᎸᏛᏂᏍᏗᏍᎪᎢ" )
        degalvdvnisdiha.imperative = new DefinitionLine ( syllabary: "ᏘᎸᏛᏂᏍᏓ, ᏘᎸᏛᏂᏍᏓ" )
        degalvdvnisdiha.infinitive = new DefinitionLine ( syllabary: "ᏧᎸᏛᏂᏍᏙᏗ" )
        degalvdvnisdiha.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎸᏛᏂᏍᏗᎭ, ᏕᏥᎸᏛᏂᏍᏗᎭ" )
        degalvdvnisdiha.present3rd = new DefinitionLine ( syllabary: "ᏕᎦᎸᏛᏂᏍᏗᎭ" )
        degalvdvnisdiha.remotepast = new DefinitionLine ( syllabary: "ᏚᎸᏛᏂᏍᏔᏅᎢ" )
        deganadiwsga.habitual = new DefinitionLine ( syllabary: "ᏕᎦᎾᏗᏫᏍᎪᎢ" )
        deganadiwsga.imperative = new DefinitionLine ( syllabary: "ᏘᎾᏗᏫ" )
        deganadiwsga.infinitive = new DefinitionLine ( syllabary: "ᏧᎾᏗᏫᏍᏗ" )
        deganadiwsga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎾᏗᏫᏍᎦ" )
        deganadiwsga.present3rd = new DefinitionLine ( syllabary: "ᏕᎦᎾᏗᏫᏍᎦ" )
        deganadiwsga.remotepast = new DefinitionLine ( syllabary: "ᏚᎾᏗᏫᏒᎢ" )
        deganojahlvsga.habitual = new DefinitionLine ( syllabary: "ᏕᎦᏃᏣᏢᏍᎪᎢ" )
        deganojahlvsga.imperative = new DefinitionLine ( syllabary: "ᏘᏃᏣᏢᎦ" )
        deganojahlvsga.infinitive = new DefinitionLine ( syllabary: "ᏧᏃᏣᎸᏗ" )
        deganojahlvsga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏃᏣᎸᏍᎦ" )
        deganojahlvsga.present3rd = new DefinitionLine ( syllabary: "ᏕᎦᏃᏣᏢᏍᎦ" )
        deganojahlvsga.remotepast = new DefinitionLine ( syllabary: "ᏚᏃᏣᏝᏅᎢ" )
        degasohga.habitual = new DefinitionLine ( syllabary: "ᏕᎦᏐᎪᎢ" )
        degasohga.imperative = new DefinitionLine ( syllabary: "ᏘᏐᎩ" )
        degasohga.infinitive = new DefinitionLine ( syllabary: "ᏧᏩᏐᎯᏍᏗ" )
        degasohga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏐᎦ" )
        degasohga.present3rd = new DefinitionLine ( syllabary: "ᏕᎦᏐᎦ" )
        degasohga.remotepast = new DefinitionLine ( syllabary: "ᏚᏩᏐᏨᎢ" )
        degetvsga.habitual = new DefinitionLine ( syllabary: "ᏕᎨᏛᏍᎪᎢ" )
        degetvsga.imperative = new DefinitionLine ( syllabary: "ᏖᏛᎦ" )
        degetvsga.infinitive = new DefinitionLine ( syllabary: "ᏧᏪᏘᏗ" )
        degetvsga.present1st = new DefinitionLine ( syllabary: "ᏕᎨᏛᏍᎦ" )
        degetvsga.present3rd = new DefinitionLine ( syllabary: "ᏕᎨᏛᏍᎦ" )
        degetvsga.remotepast = new DefinitionLine ( syllabary: "ᏚᏪᏘᏅᎢ" )
        degosisiha.habitual = new DefinitionLine ( syllabary: "ᏕᎪᏏᏏᏍᎪᎢ" )
        degosisiha.imperative = new DefinitionLine ( syllabary: "ᏙᏏᏌ" )
        degosisiha.infinitive = new DefinitionLine ( syllabary: "ᏧᏬᏏᏐᏗ" )
        degosisiha.present1st = new DefinitionLine ( syllabary: "ᏕᎪᏏᏏᎭ" )
        degosisiha.present3rd = new DefinitionLine ( syllabary: "ᏕᎪᏏᏏᎭ" )
        degosisiha.remotepast = new DefinitionLine ( syllabary: "ᏚᏬᏏᏌᏅᎢ" )
        degukdiha.habitual = new DefinitionLine ( syllabary: "ᏕᎫᎪᏗᏍᎪᎢ" )
        degukdiha.imperative = new DefinitionLine ( syllabary: "ᏚᎪᏓ" )
        degukdiha.infinitive = new DefinitionLine ( syllabary: "ᏧᏭᎪᏙᏗ" )
        degukdiha.present1st = new DefinitionLine ( syllabary: "ᏕᎫᎪᏗᎭ" )
        degukdiha.present3rd = new DefinitionLine ( syllabary: "ᏕᎫᎪᏗᎭ" )
        degukdiha.remotepast = new DefinitionLine ( syllabary: "ᏚᏭᎪᏔᏅᎢ" )
        degvdiyea.habitual = new DefinitionLine ( syllabary: "ᏕᎬᏗᏰᏍᎪᎢ" )
        degvdiyea.imperative = new DefinitionLine ( syllabary: "ᏛᏗᏯ" )
        degvdiyea.infinitive = new DefinitionLine ( syllabary: "ᏧᏩᏗᏰᏗ" )
        degvdiyea.present1st = new DefinitionLine ( syllabary: "ᏕᎬᏗᏰᎠ" )
        degvdiyea.present3rd = new DefinitionLine ( syllabary: "ᏕᎬᏗᏰᎠ" )
        degvdiyea.remotepast = new DefinitionLine ( syllabary: "ᏚᏩᏗᏰᎥᎢ" )
        degvtohia.habitual = new DefinitionLine ( syllabary: "ᏕᎬᏙᎯᏍᎪᎢ" )
        degvtohia.imperative = new DefinitionLine ( syllabary: "ᏛᏙᎯ" )
        degvtohia.infinitive = new DefinitionLine ( syllabary: "ᏧᏮᏙᎯᏍᏗ" )
        degvtohia.present1st = new DefinitionLine ( syllabary: "ᏕᎬᏙᎯᎠ" )
        degvtohia.present3rd = new DefinitionLine ( syllabary: "ᏕᎬᏙᎯᎠ" )
        degvtohia.remotepast = new DefinitionLine ( syllabary: "ᏚᏮᏙᎯᏒᎢ" )
        dekalihgwadega.habitual = new DefinitionLine ( syllabary: "ᏕᎧᎵᏆᏕᎪᎢ" )
        dekalihgwadega.imperative = new DefinitionLine ( syllabary: "ᏘᎵᏆᏚᎦ, ᏘᏟᏆᏚᎦ" )
        dekalihgwadega.infinitive = new DefinitionLine ( syllabary: "ᏧᏟᏆᏗᏅᏗ" )
        dekalihgwadega.present1st = new DefinitionLine ( syllabary: "ᏕᏥᎵᏆᏕᎦ" )
        dekalihgwadega.present3rd = new DefinitionLine ( syllabary: "ᏕᎧᎵᏆᏕᎦ" )
        dekalihgwadega.remotepast = new DefinitionLine ( syllabary: "ᏚᏟᏆᏗᏅᏒᎢ" )
        dekanogia.habitual = new DefinitionLine ( syllabary: "ᏕᎧᏃᎩᏍᎪᎢ" )
        dekanogia.imperative = new DefinitionLine ( syllabary: "ᏘᏃᎩ" )
        dekanogia.infinitive = new DefinitionLine ( syllabary: "ᏧᏃᎩᏍᏗ" )
        dekanogia.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏃᎩᎠ" )
        dekanogia.present3rd = new DefinitionLine ( syllabary: "ᏕᎧᏃᎩᎠ" )
        dekanogia.remotepast = new DefinitionLine ( syllabary: "ᏚᏃᎩᏒᎢ" )
        dekanugosga.habitual = new DefinitionLine ( syllabary: "ᏕᎧᏄᎪᏍᎪᎢ" )
        dekanugosga.imperative = new DefinitionLine ( syllabary: "ᏘᏄᎪᎳ" )
        dekanugosga.infinitive = new DefinitionLine ( syllabary: "ᏧᏄᎪᏍᏗ" )
        dekanugosga.present1st = new DefinitionLine ( syllabary: "ᏕᏥᏄᎪᏍᎦ" )
        dekanugosga.present3rd = new DefinitionLine ( syllabary: "ᏕᎧᏄᎪᏍᎦ" )
        dekanugosga.remotepast = new DefinitionLine ( syllabary: "ᏚᏄᎪᏒᎢ" )
        dekgiloa.habitual = new DefinitionLine ( syllabary: "ᏕᎬᎩᎶᏍᎪᎢ" )
        dekgiloa.imperative = new DefinitionLine ( syllabary: "ᏛᎯᎶᏣ" )
        dekgiloa.infinitive = new DefinitionLine ( syllabary: "ᏧᎩᎶᏍᏗ" )
        dekgiloa.present1st = new DefinitionLine ( syllabary: "ᏕᎬᎩᎶᎠ" )
        dekgiloa.present3rd = new DefinitionLine ( syllabary: "ᏕᎬᎩᎶᎠ" )
        dekgiloa.remotepast = new DefinitionLine ( syllabary: "ᏚᎩᎶᎥᎢ" )
        dudlosga.habitual = new DefinitionLine ( syllabary: "ᏚᏠᏍᎪᎢ" )
        dudlosga.imperative = new DefinitionLine ( syllabary: "ᏗᏣᏠᎯ" )
        dudlosga.infinitive = new DefinitionLine ( syllabary: "ᏧᏠᎯᏍᏗ" )
        dudlosga.present1st = new DefinitionLine ( syllabary: "ᏓᏆᏠᏍᎦ" )
        dudlosga.present3rd = new DefinitionLine ( syllabary: "ᏚᏠᏍᎦ" )
        dudlosga.remotepast = new DefinitionLine ( syllabary: "ᏚᏠᏒᎢ" )
        dudoa.habitual = new DefinitionLine ( syllabary: "ᏚᏙᎣᎢ" )
        dudoa.imperative = new DefinitionLine ( syllabary: "ᏕᏣᏙᎡᏍᏗ" )
        dudoa.infinitive = new DefinitionLine ( syllabary: "ᏧᏙᏍᏗ" )
        dudoa.present1st = new DefinitionLine ( syllabary: "ᏓᏆᏙᎠ" )
        dudoa.present3rd = new DefinitionLine ( syllabary: "ᏚᏙᎠ" )
        dudoa.remotepast = new DefinitionLine ( syllabary: "ᏚᏙᎥᎢ" )
        duktinvta.habitual = new DefinitionLine ( syllabary: "ᏚᎦᏘᏅᏙᎢ" )
        duktinvta.imperative = new DefinitionLine ( syllabary: "ᏕᏣᎦᏘᏅᏖᏍᏗ" )
        duktinvta.infinitive = new DefinitionLine ( syllabary: "ᏧᎦᏘᏅᏘᏗ" )
        duktinvta.present1st = new DefinitionLine ( syllabary: "ᏓᏆᎦᏘᏅᏔ" )
        duktinvta.present3rd = new DefinitionLine ( syllabary: "ᏚᎦᏘᏅᏔ" )
        duktinvta.remotepast = new DefinitionLine ( syllabary: "ᏚᎦᏘᏅᏛᎢ" )
        dusgalesdiha.habitual = new DefinitionLine ( syllabary: "ᏚᏍᎦᎴᏍᏗᏍᎪᎢ" )
        dusgalesdiha.imperative = new DefinitionLine ( syllabary: "ᏗᏣᏍᎦᎴᏍᏓ" )
        dusgalesdiha.infinitive = new DefinitionLine ( syllabary: "ᏧᏍᎦᎴᏍᏙᏗ" )
        dusgalesdiha.present1st = new DefinitionLine ( syllabary: "ᏓᏆᏍᎦᎴᏍᏗᎭ" )
        dusgalesdiha.present3rd = new DefinitionLine ( syllabary: "ᏚᏍᎦᎴᏍᏗᎭ" )
        dusgalesdiha.remotepast = new DefinitionLine ( syllabary: "ᏚᏍᎦᎴᏍᏔᏅᎢ" )
        nuwanhdi.habitual = new DefinitionLine ( syllabary: " ᏄᏩᏅᏙᎢ" )
        nuwanhdi.imperative = new DefinitionLine ( syllabary: " ᏂᏨᏅᏕᏍᏗ" )
        nuwanhdi.infinitive = new DefinitionLine ( syllabary: "----" )
        nuwanhdi.present1st = new DefinitionLine ( syllabary: " ᎾᏋᏅᏗ" )
        nuwanhdi.present3rd = new DefinitionLine ( syllabary: " ᏄᏩᏅᏗ" )
        nuwanhdi.remotepast = new DefinitionLine ( syllabary: " ᏄᏩᏅᏛᎢ" )
        wadia.habitual = new DefinitionLine ( syllabary: "ᏩᏗᏍᎪᎢ" )
        wadia.imperative = new DefinitionLine ( syllabary: "ᏫᏓ" )
        wadia.infinitive = new DefinitionLine ( syllabary: "ᏭᏗᏍᏗ" )
        wadia.present1st = new DefinitionLine ( syllabary: "ᏫᏥᏗᎠ" )
        wadia.present3rd = new DefinitionLine ( syllabary: "ᏩᏗᎠ" )
        wadia.remotepast = new DefinitionLine ( syllabary: "ᏭᏛᎢ" )
        wahvsga.habitual = new DefinitionLine ( syllabary: "ᏩᎲᏍᎪᎢ" )
        wahvsga.imperative = new DefinitionLine ( syllabary: "ᏫᎲᎦ" )
        wahvsga.infinitive = new DefinitionLine ( syllabary: "ᏭᏗ" )
        wahvsga.present1st = new DefinitionLine ( syllabary: "ᏫᏥᎥᏍᎦ" )
        wahvsga.present3rd = new DefinitionLine ( syllabary: "ᏩᎲᏍᎦ" )
        wahvsga.remotepast = new DefinitionLine ( syllabary: "ᏭᏅᎢ" )
        wakti.habitual = new DefinitionLine ( syllabary: "ᏩᎦᏛᎢ" )
        wakti.imperative = new DefinitionLine ( syllabary: "ᏫᎦᏖᏍᏗ" )
        wakti.infinitive = new DefinitionLine ( syllabary: "" )
        wakti.present1st = new DefinitionLine ( syllabary: "ᏫᏥᎦᏘ" )
        wakti.present3rd = new DefinitionLine ( syllabary: "ᏩᎦᏘ" )
        wakti.remotepast = new DefinitionLine ( syllabary: "ᏩᎦᏛᎢ" )
        wigakahvsga.habitual = new DefinitionLine ( syllabary: "ᏫᎦᎧᎲᏍᎪᎢ" )
        wigakahvsga.imperative = new DefinitionLine ( syllabary: "ᏫᏯᎧᎲᎦ" )
        wigakahvsga.infinitive = new DefinitionLine ( syllabary: "ᏭᏩᎪᏗ" )
        wigakahvsga.present1st = new DefinitionLine ( syllabary: "ᏫᏥᏯᎧᎲᏍᎦ" )
        wigakahvsga.present3rd = new DefinitionLine ( syllabary: "ᏫᎦᎧᎲᏍᎦ" )
        wigakahvsga.remotepast = new DefinitionLine ( syllabary: "ᏭᏩᎧᏅᎢ" )
        wiganehvsga.habitual = new DefinitionLine ( syllabary: "ᏫᎦᏁᎲᏍᎪᎢ" )
        wiganehvsga.imperative = new DefinitionLine ( syllabary: "ᏫᏁᎲᎦ" )
        wiganehvsga.infinitive = new DefinitionLine ( syllabary: "ᏭᏁᏗ" )
        wiganehvsga.present1st = new DefinitionLine ( syllabary: "ᏫᏥᏁᎥᏍᎦ" )
        wiganehvsga.present3rd = new DefinitionLine ( syllabary: "ᏫᎦᏁᎲᏍᎦ" )
        wiganehvsga.remotepast = new DefinitionLine ( syllabary: "ᏭᏁᏅᎢ" )
        wiganvvsga.habitual = new DefinitionLine ( syllabary: "ᏫᎦᏅᎥᏍᎪᎢ" )
        wiganvvsga.imperative = new DefinitionLine ( syllabary: "ᏫᏅᎥᎦ" )
        wiganvvsga.infinitive = new DefinitionLine ( syllabary: "ᏭᏅᏗ" )
        wiganvvsga.present1st = new DefinitionLine ( syllabary: "ᏫᏥᏅᎥᏍᎦ" )
        wiganvvsga.present3rd = new DefinitionLine ( syllabary: "ᏫᎦᏅᎥᏍᎦ" )
        wiganvvsga.remotepast = new DefinitionLine ( syllabary: "ᏭᏅᏅᎢ" )
        wudeliga.habitual = new DefinitionLine ( syllabary: "ᏭᏕᎵᎪ" )
        wudeliga.imperative = new DefinitionLine ( syllabary: "ᏫᏣᏕᎵᎩ" )
        wudeliga.infinitive = new DefinitionLine ( syllabary: "ᏭᏕᎵᏍᏗ" )
        wudeliga.present1st = new DefinitionLine ( syllabary: "ᏩᏆᏕᎵᎦ" )
        wudeliga.present3rd = new DefinitionLine ( syllabary: "ᏭᏕᎵᎦ" )
        wudeliga.remotepast = new DefinitionLine ( syllabary: "ᏭᏕᎵᏨᎢ" )
    }

    def conj(String subject, String object, Stemmer stemmer, String verbTense, String partofspeechc){
        Conjugate conjugate = new Conjugate()
        return conjugate.conjugate(subject, object, stemmer, verbTense, partofspeechc)
    }
}
