import java.util.Scanner;
public class DemoProduto{
    public static void main (String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        float preco;
        
        System.out.println("Digte quant de Produtos: ");
        int n=sc.nextInt();
        sc.nextLine();
        Produto[] p = new Produto [n];
        
        for(int i = 0; i<p.length; i++){
            p[i] = new Produto();
            
            System.out.println("Nome:");
            nome = sc.nextLine();
            p[i].setNome(nome);
            
            System.out.println("Preço:");
            preco = sc.nextFloat();
            sc.nextLine();
            p[i].setPreco(preco);
        }
        float soma = 0;
        for(int i = 0; i<p.length; i++){
            soma = soma + p[i].getPreco();
            
        }
         soma = soma / p.length;
        System.out.println("Media:"+soma);
        
        Produto maior = p[0];
        for(int i = 1; i<p.length; i++){
            if(p[i].compareTo(maior) == 1){
            maior = p[i];
            }
        }
         System.out.println("Maior:" +maior);
         
        Produto aux;
        for(int i = 0; i<p.length-1; i++){
        for(int j = i+1; j<p.length; j++){
            if(p[i].compareTo(p[j]) == 1){
                aux = p[i];
                p[i] = p[j];
                p[j] = aux;
            }
        }
        }  
        for(int i = 0; i<p.length; i++){
                    System.out.println(p[i]);
        }
         System.out.println("\nÚltimo: " + p[p.length-1]);
        sc.close();
    }
}
