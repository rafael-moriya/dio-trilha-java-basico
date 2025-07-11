/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conta_banco;
import javax.swing.JOptionPane;
/**
 *
 * @author Rafael
 */
public class Conta_terminal {
    public static void main(String[] args) {
    String nomeCliente,agencia;
    int num;
    Double saldo;
    
   num = Integer.parseInt(JOptionPane.showInputDialog("Por favor,digite o numero da conta"));
   nomeCliente = JOptionPane.showInputDialog("Por favor,Digite o nome do cliente:");
   agencia = JOptionPane.showInputDialog("Por favor,Digite o número da agência:");
   saldo = Double.parseDouble(JOptionPane.showInputDialog("Por favor,Digite o saldo:"));
   
  JOptionPane.showMessageDialog(null,"Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, "
          + " sua agência é " + agencia + " ,conta " + num + " e seu saldo R$" + saldo + "já está disponível para saque\".");
    
    }
}
