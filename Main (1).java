public interface CarbonFootprint{
    float getCarbonFootprint();
}

//-----------------------------------------------------------
public abstract class Edificio implements CarbonFootprint{
    private int constanteCarbono = 25; // toneladas por metro construido por ano
    
    private int altura; //Em metros
    
    public int getAltura() {
        return altura;
    }
    
    public void setAltura(int nova_altura) {
        altura = nova_altura;
    }
    
    public float getCarbonFootprint(){
        return constanteCarbono * altura; //toneladas por ano
    }
}
//-----------------------------------------------------------
public class Carro implements CarbonFootprint {
    
    private int autonomia; // em kms por litro
    
    private int kilometros; //Kilometros por mês
    
    public int getKilometros() {
        return kilometros;
    }
    
    public void setKilometros(int novo_kilometros) {
        kilometros = novo_kilometros;
    }
    
    public int getAutonomia(){
        return autonomia;
    }
    
    public void setAutonomia (int nova_autonomia){
        autonomia=nova_autonomia;
    }
    
    public float getCarbonFootprint(){
        return (kilometros/autonomia)*2.31; //Taxa de emissão média d gasolina em kg por litro
    }
}
//-----------------------------------------------------------
public class Bicicleta implements CarbonFootprint {
    
    private int tempoPedalando; //Em horas
    
    public void buzinar() {
        System.out.println("Prim prim");
    }
    
    public void setTempoPedalando(int novo_tempo){
        tempoPedalando=novo_tempo;
    }
    public int getTempoPedalando(){
        return tempoPedalando;
    }
    
    public float getCarbonFootprint(){
        return tempoPedalando*0.4; // kg de CO2 
    }
}
//-----------------------------------------------------------

//---------------SUBCLASSE CASA------------------------------
public class Casa extends Edificio{
    private float ConstanteEmissao = 1.2; //kg por m2 por ano de uma casa (inventei esse número)
    
    private int areaConstrudida; //em m2
    
    public int getAreaConstruida(){
        return areaConstrudida;
    }
    
    public void setAreaConstruida(int nova_area){
        areaConstrudida = nova_area;
    }
    
    public float getCarbonFootprint(){
        return areaConstrudida*ConstanteEmissao; //em kg de CO2 por ano
    }
}
//---------------SUBCLASSE ESCOLA----------------------------
public class Escola extends Edificio{
    private float emissaoPorAluno = 1.7; //Tonelada por ano por aluno
    
    private int alunos;
    
    public int getAlunos(){
        return alunos;
    }
    
    public void setAlunos(int novo_alunos){
        alunos = novo_alunos;
    }
    
    public float getCarbonFootprint(){
        return alunos*emissaoPorAluno; //em toneladas por ano
    }
}
//-----------------------------------------------------------

public class Main
{
	public static void main() {
		
	}
}