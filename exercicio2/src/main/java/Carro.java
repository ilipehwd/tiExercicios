public class Carro {
    private int id;
    private String modelo;
    private String marca;
    private int ano;

    public Carro(int id, String modelo, String marca, int ano) {
        this.id = id;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getAno() {
        return ano;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    @Override
	public String toString() {
		return "Carro [id=" + id + ", modelo=" + modelo + ", marca=" + marca + ", ano=" + ano + "]";
	}
}
