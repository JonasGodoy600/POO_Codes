public class Personagem{
    String nome;
    int energia;
    int fome = 0;
    int sono = 0;

    void cacar(){
        System.out.printf("%s caçando\n", nome);
        if(energia >= 2){
            System.out.printf("%s caçando\n", nome);
            energia -= 2;
        } else{
            System.out.printf("%s sem energia para caçar\n", nome);
        }
        if (fome < 10)
        fome = fome + 1; //fome += 1 , fome ++;

        //sono = sono +1;
        sono = sono == 10 ? sono : sono + 1;
    }

    void comer(){
        System.out.println(nome + " comendo");
    }

    void dormir(){
        System.out.printf(nome + " dormindo");
    }
}