class RodarAplicacao {

    public static void main(String[] args) {
        //exemplo 1 - passando parametros por set
        Carro carro1 = new Carro(); // criando objeto carro1 para o tipo classe Carro - new Carro(): construtor padrão

        carro1.setCor("Azul");
        carro1.setModelo("BMW Série 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCor());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalValorTanque(6.39));

        //exemplo 2 com sobrecarga no construtor - passando parametros
        Carro carro2 = new Carro("Cinza", "Mercedes-Benz Classe C ", 66); //construtor com parametros

        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCor());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalValorTanque(6.46));

    }
}