package cherokee.dictionary.verb.conjugation.hold

def list = """def SG1SG1
SG1SG2 
SG1SG3AN 
SG1SG3IN 
SG1DL1INCL 
SG1DL1EXCL 
SG1PL1INCL 
SG1PL1EXCL 
SG1DL2 
SG1PL2 
SG1PL3AN 
SG1PL3IN 
SG2SG1 
SG2SG2 
SG2SG3AN 
SG2SG3IN 
SG2DL1INCL 
SG2DL1EXCL 
SG2PL1INCL 
SG2PL1EXCL 
SG2DL2 
SG2PL2 
SG2PL3AN 
SG2PL3IN 
SG3SG1 
SG3SG2 
SG3SG3AN 
SG3SG3IN 
SG3DL1INCL 
SG3DL1EXCL 
SG3PL1INCL 
SG3PL1EXCL 
SG3DL2 
SG3PL2 
SG3PL3AN 
SG3PL3IN 
DL1INCLSG1 
DL1INCLSG2 
DL1INCLSG3AN 
DL1INCLSG3IN 
DL1INCLDL1INCL 
DL1INCLDL1EXCL 
DL1INCLPL1INCL 
DL1INCLPL1EXCL 
DL1INCLDL2 
DL1INCLPL2 
DL1INCLPL3AN 
DL1INCLPL3IN 
DL1EXCLSG1 
DL1EXCLSG2 
DL1EXCLSG3AN 
DL1EXCLSG3IN 
DL1EXCLDL1INCL 
DL1EXCLDL1EXCL 
DL1EXCLPL1INCL 
DL1EXCLPL1EXCL 
DL1EXCLDL2 
DL1EXCLPL2 
DL1EXCLPL3AN 
DL1EXCLPL3IN 
PL1INCLSG1 
PL1INCLSG2 
PL1INCLSG3AN 
PL1INCLSG3IN 
PL1INCLDL1INCL 
PL1INCLDL1EXCL 
PL1INCLPL1INCL 
PL1INCLPL1EXCL 
PL1INCLDL2 
PL1INCLPL2 
PL1INCLPL3AN 
PL1INCLPL3IN 
PL1EXCLSG1 
PL1EXCLSG2 
PL1EXCLSG3AN 
PL1EXCLSG3IN 
PL1EXCLDL1INCL 
PL1EXCLDL1EXCL 
PL1EXCLPL1INCL 
PL1EXCLPL1EXCL 
PL1EXCLDL2 
PL1EXCLPL2 
PL1EXCLPL3AN 
PL1EXCLPL3IN 
DL2SG1 
DL2SG2 
DL2SG3AN 
DL2SG3IN 
DL2DL1INCL 
DL2DL1EXCL 
DL2PL1INCL 
DL2PL1EXCL 
DL2DL2 
DL2PL2 
DL2PL3AN 
DL2PL3IN 
PL2SG1 
PL2SG2 
PL2SG3AN 
PL2SG3IN 
PL2DL1INCL 
PL2DL1EXCL 
PL2PL1INCL 
PL2PL1EXCL 
PL2DL2 
PL2PL2 
PL2PL3AN 
PL2PL3IN 
PL3SG1 
PL3SG2 
PL3SG3AN 
PL3SG3IN 
PL3DL1INCL 
PL3DL1EXCL 
PL3PL1INCL 
PL3PL1EXCL 
PL3DL2 
PL3PL2 
PL3PL3AN 
PL3PL3IN"""

def tenses = ["present", "past", "future", "habitual", "infinitive"]
tenses.each { tense ->
    list.eachLine {

        println "SQL.executeInsert(query, generateQuery(it.id, ${tense}.${it.trim()}))"
    }
}