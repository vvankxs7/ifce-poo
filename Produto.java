public class Produto{
    private String nome;
    private float preco;
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
     public void setPreco(float preco){
        this.preco = preco;
    }
    public float getPreco(){
        return this.preco;
    }
    
    public int compareTo(Produto p){
        if(this.preco > p.getPreco())
            return 1;
        else if(this.preco<p.getPreco())
            return -1;
        else return 0;
    }
    public String toString(){
        String r;
        r = "\nNome: "+this.nome+"\nPreço: "+this.preco;
        return r;
    }
}
