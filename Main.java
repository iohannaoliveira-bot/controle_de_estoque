while (true){
            Scanner scanner = new Scanner(System.in);
            opcao = scanner.nextInt();

            System.out.println("CONTROLE DE ESTOQUE: \n");
            System.out.print("1 - Cadastrar produtos");
            System.out.print("2 - Listar produtos");
            System.out.print("3 - Entarda de produtos");
            System.out.print("4 - Saída de produtos");
            System.out.print("5 - Buscar produtos");
            System.out.print("0 - Sair");

            switch (opcao){
                case 1:
                    break;
                case 2:
                    estoque.listarProdutos();
                    break;
                case 3:
                    int id = getId(scanner);
                    int qt =  sacnner.nextInt();
                    estoque.entrada(id, qt);
                    break;
                case 4:
                    int idSaida = getId(scanner);
                    int qtSaida = scanner.nextInt();
                    estoque.saida(idSaida, qtSaida);
                    break;
                case 5:
                    System.out.println("Informe o ID do produto: ");
                    int idBusca = scanne.nextInt();
                    estoque.buscaProduto(idBusca);
                    break;

                case 0:
                    return;
                default:
                    System.out.println("Informe")


            }



        }
    }
