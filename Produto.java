public void adicionar(int quantidade){
        quantEstoque += quantidade;
    }

    public void remover(int quantidade){
        quantEstoque -= quantidade;
    }

    public void exibirDados(){
        System.out.println("ID: " + id);
        System.out.println("Nome: " + nome);
        System.out.println("Preco R$" + preco);
        System.out.println("Quantidade em estoque " +quantidade);
    }
}
