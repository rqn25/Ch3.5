
import javax.swing.JOptionPane;

public class Role {
public enum AccountType {Administrator, Faculty, Staff, Student, Guest}
public static void main(String[] args) {

	AccountType[] choices = { AccountType.Administrator, AccountType.Faculty, AccountType.Staff, AccountType.Student, AccountType.Guest };
	AccountType select = (AccountType) JOptionPane.showInputDialog(null,"Select a role.", "List of roles", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);

	while (select!=null) {
		switch (select) {
		case Administrator:
			JOptionPane.showMessageDialog(null, "Welcome " + select);
			break;
		case Faculty:
			JOptionPane.showMessageDialog(null, "Welcome " + select);
			break;
		case Staff:
			JOptionPane.showMessageDialog(null, "Welcome " + select);
			break;
		case Student:
			JOptionPane.showMessageDialog(null, "Welcome " + select);
			break;
		case Guest:
			JOptionPane.showMessageDialog(null, "Welcome " + select);
			break;
		}
		select = (AccountType) JOptionPane.showInputDialog(null,"Select a role.", "List of roles", JOptionPane.INFORMATION_MESSAGE, null, choices, choices[3]);
		}
		JOptionPane.showMessageDialog(null, "Good Bye");
	}
}
