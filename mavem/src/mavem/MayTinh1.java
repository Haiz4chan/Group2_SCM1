package mavem;

public class MayTinh1 {
	JButton btnButton_note = new JButton(".");
	btnButton_note.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_note.setBackground(Color.GRAY);
	btnButton_note.setBounds(130, 430, 70, 70);
	contentPane.add(btnButton_note);

	/**
	 * Khu vuc code nut < . >.
	 */

	JButton btnButton_Add = new JButton("+");
	btnButton_Add.setForeground(new Color(255, 165, 0));
	btnButton_Add.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_Add.setBackground(Color.GRAY);
	btnButton_Add.setBounds(354, 187, 70, 70);
	contentPane.add(btnButton_Add);

	/**
	 * Khu vuc code nut + <+>.
	 */

	JButton btnButton_Sub = new JButton("-");
	btnButton_Sub.setForeground(new Color(255, 165, 0));
	btnButton_Sub.setFont(new Font("Tahoma", Font.BOLD, 60));
	btnButton_Sub.setBackground(Color.GRAY);
	btnButton_Sub.setBounds(354, 268, 70, 70);
	contentPane.add(btnButton_Sub);

	/**
	 * Khu vuc code nut tru<->
	 */

	JButton btnButton_Multi = new JButton("x");
	btnButton_Multi.setForeground(new Color(255, 165, 0));
	btnButton_Multi.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_Multi.setBackground(Color.GRAY);
	btnButton_Multi.setBounds(354, 349, 70, 70);
	contentPane.add(btnButton_Multi);

	/**
	 * Khu vuv code nut nhan <x>.
	 */

	JButton btnButton_Div = new JButton("/");
	btnButton_Div.setForeground(new Color(255, 140, 0));
	btnButton_Div.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_Div.setBackground(Color.GRAY);
	btnButton_Div.setBounds(354, 430, 70, 70);
	contentPane.add(btnButton_Div);

	/**
	 * Khu vuc code nut chia</>.
	 */

	JButton btnButton_CLR = new JButton("CLR");
	btnButton_CLR.setBackground(Color.GRAY);
	btnButton_CLR.setForeground(new Color(255, 140, 0));
	btnButton_CLR.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_CLR.setBounds(307, 128, 117, 48);
	contentPane.add(btnButton_CLR);

	/**
	 * Khu vuc code nut clear<CLR>.
	 */

	JButton btnButton_Equals = new JButton("=");
	btnButton_Equals.setForeground(new Color(255, 165, 0));
	btnButton_Equals.setBackground(Color.GRAY);
	btnButton_Equals.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_Equals.setBounds(241, 430, 70, 70);
	contentPane.add(btnButton_Equals);

	/**
	 * Khu vuc code nut <=>.
	 */

	txtCasiocaculator = new JTextField();
	txtCasiocaculator.setHorizontalAlignment(SwingConstants.CENTER);
	txtCasiocaculator.setForeground(new Color(0, 0, 0));
	txtCasiocaculator.setText("CASIO_Caculator");
	txtCasiocaculator.setFont(new Font("Tahoma", Font.BOLD, 30));
	txtCasiocaculator.setBackground(Color.DARK_GRAY);
	txtCasiocaculator.setBounds(20, 128, 277, 48);
	contentPane.add(txtCasiocaculator);
	txtCasiocaculator.setColumns(10);
}
}
}
