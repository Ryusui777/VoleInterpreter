package compiler;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Compiler {

    public static void main(String[] args) {

        ArrayList<String> instructions = Tokenizer.getTokens("C:\\Users\\david\\IdeaProjects\\VoleInterpreter\\src\\compiler\\Hello.vole");
        System.out.println("\n" + instructions);

    }

    /**
     * The class {@code Tokenizer} is meant only to contain import methods, this given
     * the fact that java doesn't support nested methods, thus this is the only method
     * of encapsulation and have clean code, or to create a new file.
     */

    public static class Tokenizer {

        /**
         * The getTokens method parses a document and extracts the tokens from it,
         * leaving comments, spaces, and other characters like '\n'
         */

        public static ArrayList<String> getTokens(String fileName) {

            return parseDoc(fileName);

        }

        /**
         * The parseDoc method parses through the document and uses the class's Tokenizer method getCleanToken on
         * each line to get all the syntax and strips all the comments, and then puts
         *
         * @param docPath is the path to the src code file
         */
        private static ArrayList<String> parseDoc(String docPath) {

            ArrayList<String> parsedDoc = new ArrayList<>();

            try {

                Scanner scanner = new Scanner(new File(docPath));

                while (scanner.hasNextLine()) {
                    String line = scanner.nextLine();

                    ArrayList<String> tokens = getCleanToken(line);

                    parsedDoc.addAll(tokens);
                }


            } catch (FileNotFoundException e) {

                System.out.println("File not found");

            }

            return parsedDoc;

        }

        /**
         * The getCleanToken method takes a String and strips the blank spaces,
         * and characters like '\n', leaving only the tokens
         */
        private static ArrayList<String> getCleanToken(String line) {

            char[] syntaxChars = {'(', ')', ';'};

            StringBuilder cleanToken = new StringBuilder();

            ArrayList<String> cleanTokens = new ArrayList<>();

            char lastChar = ' ';

            boolean isString = false;

            for (char currentChar : line.toCharArray()) {

                boolean isSyntax = false;

                if (currentChar == '"'){
                    if (isString){
                        System.out.println("what");
                        cleanToken.append(currentChar);
                        cleanTokens.add(cleanToken.toString());
                        cleanToken.setLength(0);
                        isString = false;
                        continue;
                    }
                    else{
                        if(!cleanToken.isEmpty()) {
                            cleanTokens.add(cleanToken.toString());
                        }
                        cleanToken.setLength(0);
                        isString = true;
                    }
                }
                if(isString){
                    cleanToken.append(currentChar);
                    continue;
                }
                if (currentChar == '/' && lastChar == '/') {

                    if (!cleanToken.isEmpty()) {
                        cleanToken.deleteCharAt(cleanToken.length() - 1);
                    }
                    return cleanTokens;

                }

                if(currentChar == '>' && lastChar == '-') {
                    if (!cleanToken.isEmpty()) {
                        cleanToken.deleteCharAt(cleanToken.length() - 1);
                        cleanTokens.add("->");
                    }
                    continue;
                }
                lastChar = currentChar;

                for (char syntaxChar : syntaxChars) {
                    if (currentChar == syntaxChar) {
                        isSyntax = true;
                        break;
                    }
                }

                if (isSyntax) {
                    if(!cleanToken.isEmpty()) {
                        cleanTokens.add(cleanToken.toString());
                    }
                    cleanTokens.add(Character.toString(currentChar));
                    cleanToken.setLength(0);
                } else if (currentChar != ' ') {
                    cleanToken.append(currentChar);
                } else if (!cleanToken.isEmpty()) {
                    cleanTokens.add(cleanToken.toString());
                }


            }
            return cleanTokens;
        }

        private static void classifier(ArrayList<String> cleanTokens) {
            String[] Keywords = {"print", "morphInt", "morphFloat"};

        }
    }
}
