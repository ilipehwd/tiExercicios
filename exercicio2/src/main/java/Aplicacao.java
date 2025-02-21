public class Aplicacao {
    
    public static void main(String[] args) {
        
        Connect dao = new Connect();
        
        dao.conectar();

        // Inserir um carro na tabela
        Carro carro = new Carro(1, "Civic", "Honda", 2020);
        if (dao.inserirCarro(carro)) {
            System.out.println("Inserção com sucesso -> " + carro.toString());
        }

        // Mostrar todos os carros
        System.out.println("==== Mostrar carros === ");
        Carro[] carros = dao.getCarros();
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i].toString());
        }

        // Atualizar um carro
        carro.setAno(2022);
        dao.atualizarCarro(carro);

        // Mostrar todos os carros novamente
        System.out.println("==== Mostrar carros após atualização === ");
        carros = dao.getCarros();
        for (int i = 0; i < carros.length; i++) {
            System.out.println(carros[i].toString());
        }
        
        // Excluir carro
        dao.excluirCarro(carro.getId());
        
        // Mostrar carros após a exclusão
        carros = dao.getCarros();
        System.out.println("==== Mostrar carros após exclusão === ");        
        if (carros != null) {
            for (int i = 0; i < carros.length; i++) {
                System.out.println(carros[i].toString());
            }
        } else {
            System.out.println("Nenhum carro encontrado no banco de dados.");
        }

        
        dao.close();
    }
}
