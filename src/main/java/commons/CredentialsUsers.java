package commons;

import configuration.AccountCredentialsUsers;

public enum CredentialsUsers implements AccountCredentialsUsers {

	USER_WEB_SAD_QA {

		@Override
		public String user(String usuario) {

			return usuario;
		}

		@Override
		public String password() {
			return "Aut1235";
		}

	}

}
