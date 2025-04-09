package Caculator;

public class MayTinh {
	
	btnButton_note.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			String currentText = txtKQ.getText();
			if (!currentText.contains(".")) {
				txtKQ.setText(currentText + ".");
			}
		}
	});

	JButton btnButton_Add = new JButton("+");
	btnButton_Add.setForeground(new Color(255, 165, 0));
	btnButton_Add.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_Add.setBackground(Color.GRAY);
	btnButton_Add.setBounds(354, 187, 70, 70);
	contentPane.add(btnButton_Add);

	btnButton_Add.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			val = Double.parseDouble(txtKQ.getText());
			Pheptinh = "+";
			txtKQ.setText(txtKQ.getText() + " " + Pheptinh + " ");

		}
	});

	JButton btnButton_Sub = new JButton("-");
	btnButton_Sub.setForeground(new Color(255, 165, 0));
	btnButton_Sub.setFont(new Font("Tahoma", Font.BOLD, 60));
	btnButton_Sub.setBackground(Color.GRAY);
	btnButton_Sub.setBounds(354, 268, 70, 70);
	contentPane.add(btnButton_Sub);

	btnButton_Sub.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			val = Double.parseDouble(txtKQ.getText());
			Pheptinh = "-";
			txtKQ.setText(txtKQ.getText() + " " + Pheptinh + " ");

		}
	});

	JButton btnButton_Multi = new JButton("x");
	btnButton_Multi.setForeground(new Color(255, 165, 0));
	btnButton_Multi.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_Multi.setBackground(Color.GRAY);
	btnButton_Multi.setBounds(354, 349, 70, 70);
	contentPane.add(btnButton_Multi);

	btnButton_Multi.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			val = Double.parseDouble(txtKQ.getText());
			Pheptinh = "x";
			txtKQ.setText(txtKQ.getText() + " " + Pheptinh + " ");

		}
	});

	JButton btnButton_Div = new JButton("/");
	btnButton_Div.setForeground(new Color(255, 140, 0));
	btnButton_Div.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_Div.setBackground(Color.GRAY);
	btnButton_Div.setBounds(354, 430, 70, 70);
	contentPane.add(btnButton_Div);

	btnButton_Div.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			val = Double.parseDouble(txtKQ.getText());
			Pheptinh = "/";
			txtKQ.setText(txtKQ.getText() + " " + Pheptinh + " ");

		}
	});

	JButton btnButton_CLR = new JButton("CLR");
	btnButton_CLR.setBackground(Color.GRAY);
	btnButton_CLR.setForeground(new Color(255, 140, 0));
	btnButton_CLR.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_CLR.setBounds(307, 128, 117, 48);
	contentPane.add(btnButton_CLR);

	btnButton_CLR.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			txtKQ.setText("");
			val = 0;
			Pheptinh = "";
		}
	});

	JButton btnButton_Equals = new JButton("=");
	btnButton_Equals.setForeground(new Color(255, 165, 0));
	btnButton_Equals.setBackground(Color.GRAY);
	btnButton_Equals.setFont(new Font("Tahoma", Font.BOLD, 40));
	btnButton_Equals.setBounds(241, 430, 70, 70);
	contentPane.add(btnButton_Equals);

	btnButton_Equals.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			try {
				String text = txtKQ.getText().trim(); 
				if (text.isEmpty()) {
					txtKQ.setText("Lỗi nhập liệu");
					return;
				}


				if (text.contains("+") || text.contains("-") || text.contains("x") || text.contains("/")) {
					String[] parts = text.split(" ");


					if (parts.length == 3) {
						double firstVal = Double.parseDouble(parts[0]);
						double secondVal = Double.parseDouble(parts[2]);


						switch (parts[1]) {
						case "+":
							val = firstVal + secondVal;
							break;
						case "-":
							val = firstVal - secondVal;
							break;
						case "x":
							val = firstVal * secondVal;
							break;
						case "/":
							if (secondVal != 0) {
								val = firstVal / secondVal;
							} else {
								txtKQ.setText("Lỗi chia 0");
								return;
							}
							break;
						default:
							txtKQ.setText("Lỗi phép tính");
							return;
						}
						txtKQ.setText(String.valueOf(val));
					} else {
						txtKQ.setText("Lỗi phép tính");
					}
				} else {
					txtKQ.setText("Lỗi phép tính");
				}
			} catch (Exception ex) {
				txtKQ.setText("Lỗi nhập liệu"); 
			}
		}
	});

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
