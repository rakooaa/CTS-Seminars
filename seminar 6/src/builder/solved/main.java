package builder.solved;

import builder.solved.user.Userbuilder;

public class main {

	public static void main(String[] args) {
		
		user user = new user.Userbuilder("bau", "miau", "hau").address("bucharest").build();

	}

}
