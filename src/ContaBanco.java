import java.util.Scanner;

public class ContaBanco {
    Scanner sc = new Scanner(System.in);
    public int numConta;
    protected String tipo;
    private String dono;
    private int saldo;
    private boolean status;

    public ContaBanco(){
        this.status = false;
        this.saldo = 0;
    }

    public void abrirConta(){
        this.status = true;
        this.numConta = this.numConta + 1;
        System.out.println("Qual o nome do dono da conta? ");
        this.dono = sc.next();
        System.out.println("Qual tipo de conta você quer abrir? ");
        System.out.println("1.Conta Corrente = CC");
        System.out.println("2.Conta Poupança = CP");
        this.tipo = sc.next();
        if(tipo.equals("CC")){
            this.saldo = 50;
        }else if(tipo.equals("CP")){
            this.saldo = 150;
        }
    }

    public void fecharConta(){
        if(this.saldo > 0){
            System.out.println("Você não pode fechar a conta se tiver dinheiro nela. ");
        }else if(this.saldo < 0){
            System.out.println("Você não pode fechar a conta com saldo devedor");
        }else if(this.status == true){
            System.out.println("Conta fechada");
            this.status = false;
        }
    }

    public void depositar(int valorDeposito){
        if(this.status == true){
            System.out.println("Qual valor você quer depositar na conta? ");
            valorDeposito = sc.nextInt();
            this.saldo = this.saldo + valorDeposito;
        }else{
            System.out.println("Conta não aberta, não á como depositar.");
        }
        
    }

    public void sacar(int valorSacar){
        if(this.status == true){
            System.out.println("Qual valor você quer sacar da conta? ");
            valorSacar = sc.nextInt();
            if(valorSacar > this.saldo){
                System.out.println("Você não pode sacar um valor maior do que á na conta");
            }else{
                this.saldo = this.saldo - valorSacar;
            }
            
        }else{
            System.out.println("Conta não aberta, não á como sacar.");
        }
        
    }

    public void pagarMensal(){
        if(this.tipo.equals("CC")){
            System.out.println("Mensalidade de 12 reais descontada da conta");
            this.saldo = this.saldo - 12;
        }else if(this.tipo.equals("CP")){
            System.out.println("Mensalidade de 20 reais descontada da conta");
            this.saldo = this.saldo - 20;
        }
    }

    public int getNumConta() {
        
        return this.numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }
    
    public String getTipo() {
       
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }


    
}




