package appPassword;

public class Fortaleza implements InterfazFortaleza {
	@Override
	public String tipoPassword(String password) {
		String fortaleza = "debil";
		if (longitudString(password) && tieneMayus(password) && tieneMinus(password) && tieneNum(password)
				&& tieneEsp(password)) {
			fortaleza = "fuerte";
		}
		if (longitudString(password) && tieneMayus(password) && tieneMinus(password) && tieneNum(password)) {
			fortaleza = "media";
		}
		return fortaleza;
	}

	public boolean longitudString(String password) {
		boolean si = false;

		if (password.length() > 7) {
			si = true;
		}

		return si;
	}

	public boolean tieneMayus(String password) {
		boolean si = false;
		for (int i = 0; i < password.length(); i++) {
			if ((int) password.charAt(i) >= 65 && (int) password.charAt(i) <= 90) {
				si = true;
			}
		}

		return si;
	}

	public boolean tieneMinus(String password) {
		boolean si = false;
		for (int i = 0; i < password.length(); i++) {
			if ((int) password.charAt(i) >= 97 && (int) password.charAt(i) <= 122) {
				si = true;
			}
		}

		return si;
	}

	public boolean tieneNum(String password) {
		boolean si = false;
		for (int i = 0; i < password.length(); i++) {
			if ((int) password.charAt(i) >= 48 && (int) password.charAt(i) <= 57) {
				si = true;
			}
		}

		return si;
	}

	public boolean tieneEsp(String password) {
		boolean si = false;
		for (int i = 0; i < password.length(); i++) {
			if ((int) password.charAt(i) >= 33 && (int) password.charAt(i) <= 47) {
				si = true;
			}
		}

		return si;
	}

}
