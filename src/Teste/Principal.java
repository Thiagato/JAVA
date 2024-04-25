package Teste;

public class Principal {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento();
        equipamento.ligar();
        System.out.println(equipamento.getLigado());

        var equip = new EquipamentoSonoro();
        equip.ligar();
        equip.estereo();
        System.out.println(equip.getLigado());
        System.out.println(equip.getEstereo());
        System.out.println(equip.getVolume());
    }
}
