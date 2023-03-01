package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileExamples {

	public static void main(String[] args) {
		// using a single dot(.) means the current directory
		// Using a double dot(..) means the parent directly

		// relative path is based on where you currently are in the folder structure
		// absolute path is from the beginning of the folder structure (root)

		// this uses an absolute path to get the starting directory of this eclipse
		// project
		File file = new File("./src/files");

		// printing absolute path gets us the full path from the root
		System.out.println(file.getAbsolutePath());

		if (file.isDirectory()) {
			System.out.println(file.getName() + " is a directory");
			// System.out.println(file.getParentFile() + " is the parent directory");

			for (File f : file.listFiles()) {
				System.out.println(f.getName());
			}
		}

		File code = new File("./src/files/FileExamples.java");
		System.out.println("The file exists = " + code.exists());

		try {
			BufferedReader br = new BufferedReader(new FileReader(code));

			String line = br.readLine();
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}

		} catch (IOException ioe) {

		}

	}

}
