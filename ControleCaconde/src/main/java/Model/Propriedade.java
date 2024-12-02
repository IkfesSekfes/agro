package Model;

public class Propriedade {
    //fk = chave estrangeira
    int propriedadePK, proprietarioFK;
    String nomePropriedade, numeroPropriedade, ruaPropriedade, bairroPropriedade;

    public int getPropriedadePK() {
        return propriedadePK;
    }

    public void setPropriedadePK(int propriedadePK) {
        this.propriedadePK = propriedadePK;
    }

    public int getProprietarioFK() {
        return proprietarioFK;
    }

    public void setProprietarioFK(int proprietarioFK) {
        this.proprietarioFK = proprietarioFK;
    }

    public String getNomePropriedade() {
        return nomePropriedade;
    }

    public void setNomePropriedade(String nomePropriedade) {
        this.nomePropriedade = nomePropriedade;
    }

    public String getNumeroPropriedade() {
        return numeroPropriedade;
    }

    public void setNumeroPropriedade(String numeroPropriedade) {
        this.numeroPropriedade = numeroPropriedade;
    }

    public String getRuaPropriedade() {
        return ruaPropriedade;
    }

    public void setRuaPropriedade(String ruaPropriedade) {
        this.ruaPropriedade = ruaPropriedade;
    }

    public String getBairroPropriedade() {
        return bairroPropriedade;
    }

    public void setBairroPropriedade(String bairroPropriedade) {
        this.bairroPropriedade = bairroPropriedade;
    }
    
    
    
}
