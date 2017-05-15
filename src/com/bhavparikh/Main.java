package com.bhavparikh;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("C:/Users/bhavya/Desktop/data.txt");
        File file1 = new File("C:/Users/bhavya/Desktop/data1.txt");
        File file2 = new File("C:/Users/bhavya/Desktop/data2.txt");
        File file3 = new File("C:/Users/bhavya/Desktop/data3.txt");
        File file4 = new File("C:/Users/bhavya/Desktop/output.txt");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the dimensions of the transition matrix: ");
        int row = scanner.nextInt();
        int col = scanner.nextInt();
        System.out.println("Enter the characters: ");
        String a = scanner.next();

        int[][] matrix = new int[row][col];
        System.out.println("Enter the elements of the matrix: ");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter error messages: ");
        int[] states = new int[row+1];
        String[] msg = new String[row+1];
        for(int i = 0; i < row+1; i++){
            states[i] = scanner.nextInt();
            msg[i] = scanner.nextLine();
        }

        try{
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(row + " " + col);
            bufferedWriter.newLine();


            bufferedWriter.close();
        } catch (Exception e){
            System.out.println("Error, writing to file '" + file + "'");
            e.printStackTrace();
        }

        try{
            FileWriter fileWriter1 = new FileWriter(file1);
            BufferedWriter bufferedWriter1 = new BufferedWriter(fileWriter1);
            for(int i = 0; i < a.length(); i++){
                bufferedWriter1.write(a.charAt(i) + "");
            }

            bufferedWriter1.close();
        } catch(Exception e){
            System.out.println("Error, writing to file '" + file1 + "'");
        }

        try{
            FileWriter fileWriter2 = new FileWriter(file2);
            BufferedWriter bufferedWriter2 = new BufferedWriter(fileWriter2);

            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    bufferedWriter2.write(matrix[i][j] + " ");
                }
                bufferedWriter2.newLine();
            }

            bufferedWriter2.close();
        } catch (Exception e) {
            System.out.println("Error, writing to file '" + file2 + "'");
        }

        try{
            FileWriter fileWriter3 = new FileWriter(file3);
            BufferedWriter bufferedWriter3 = new BufferedWriter(fileWriter3);

            for(int i = 0; i < row+1; i++){
                bufferedWriter3.write(states[i] + msg[i]);
                bufferedWriter3.newLine();
            }

            bufferedWriter3.close();
        }catch (Exception e){
            System.out.println("Error, writing to file '" + file3 + "'");
        }

        try{
            FileWriter fileWriter4 = new FileWriter(file4);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter4);

            bufferedWriter.write("import java.io.*;");
            bufferedWriter.newLine();
            bufferedWriter.write("import java.util.ArrayList;");
            bufferedWriter.newLine();
            bufferedWriter.write("import java.util.List;");
            bufferedWriter.newLine();
            bufferedWriter.write("import java.util.Scanner;");
            bufferedWriter.newLine();
            bufferedWriter.write("public class Main {");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("    public static void main(String[] args) {");
            bufferedWriter.newLine();
            bufferedWriter.write("      String fileName = \"C:/Users/bhavya/Desktop/data.txt\";");
            bufferedWriter.newLine();
            bufferedWriter.write("      File file1 = new File(\"C:/Users/bhavya/Desktop/data1.txt\");");
            bufferedWriter.newLine();
            bufferedWriter.write("      File file2 = new File(\"C:/Users/bhavya/Desktop/data2.txt\");");
            bufferedWriter.newLine();
            bufferedWriter.write("      File file3 = new File(\"C:/Users/bhavya/Desktop/data3.txt\");");
            bufferedWriter.newLine();
            bufferedWriter.write("      String line;");
            bufferedWriter.newLine();
            bufferedWriter.write("      int row = 0,col = 0;");
            bufferedWriter.newLine();
            bufferedWriter.write("      String a = null;");
            bufferedWriter.newLine();
            bufferedWriter.write("      try{");
            bufferedWriter.newLine();
            bufferedWriter.write("        FileReader fileReader = new FileReader(fileName);");
            bufferedWriter.newLine();
            bufferedWriter.write("        BufferedReader bufferedReader = new BufferedReader(fileReader);");
            bufferedWriter.newLine();
            bufferedWriter.write("        int[] arr = new int[2];");
            bufferedWriter.newLine();
            bufferedWriter.write("        int j = 0;");
            bufferedWriter.newLine();
            bufferedWriter.write("        while((line = bufferedReader.readLine()) != null){");
            bufferedWriter.newLine();
            bufferedWriter.write("          String[] s = line.split(\" \");");
            bufferedWriter.newLine();
            bufferedWriter.write("          for(String string: s ){");
            bufferedWriter.newLine();
            bufferedWriter.write("            arr[j++] = Integer.parseInt(string);");
            bufferedWriter.newLine();
            bufferedWriter.write("          }");
            bufferedWriter.newLine();
            bufferedWriter.write("        }");
            bufferedWriter.newLine();
            bufferedWriter.write("        row = arr[0];");
            bufferedWriter.newLine();
            bufferedWriter.write("        col = arr[1];");
            bufferedWriter.newLine();
            bufferedWriter.write("        bufferedReader.close();");
            bufferedWriter.newLine();
            bufferedWriter.write("      } catch (Exception e){");
            bufferedWriter.newLine();
            bufferedWriter.write("         System.out.println(\"Error, reading the file '\" + fileName + \"'\");");
            bufferedWriter.newLine();
            bufferedWriter.write("      }");
            bufferedWriter.newLine();
            bufferedWriter.write("      try{");
            bufferedWriter.newLine();
            bufferedWriter.write("        FileReader fileReader = new FileReader(file1);");
            bufferedWriter.newLine();
            bufferedWriter.write("        BufferedReader bufferedReader = new BufferedReader(fileReader);");
            bufferedWriter.newLine();
            bufferedWriter.write("        while((line = bufferedReader.readLine()) != null){");
            bufferedWriter.newLine();
            bufferedWriter.write("          a = line;");
            bufferedWriter.newLine();
            bufferedWriter.write("        }");
            bufferedWriter.newLine();
            bufferedWriter.write("        bufferedReader.close();");
            bufferedWriter.newLine();
            bufferedWriter.write("      } catch (Exception e){");
            bufferedWriter.newLine();
            bufferedWriter.write("         System.out.println(\"Error, reading the file '\" + file1 + \"'\");");
            bufferedWriter.newLine();
            bufferedWriter.write("      }");
            bufferedWriter.newLine();
            bufferedWriter.write("      int[][] matrix = new int[row][col];");
            bufferedWriter.newLine();
            bufferedWriter.write("      try{");
            bufferedWriter.newLine();
            bufferedWriter.write("        FileReader fileReader = new FileReader(file2);");
            bufferedWriter.newLine();
            bufferedWriter.write("        BufferedReader bufferedReader = new BufferedReader(fileReader);");
            bufferedWriter.newLine();
            bufferedWriter.write("        List<Integer> numbers = new ArrayList<>();");
            bufferedWriter.newLine();
            bufferedWriter.write("        while((line = bufferedReader.readLine()) != null){");
            bufferedWriter.newLine();
            bufferedWriter.write("          String[] strNumbers = line.split(\" \");");
            bufferedWriter.newLine();
            bufferedWriter.write("          for(String strNumber: strNumbers){");
            bufferedWriter.newLine();
            bufferedWriter.write("            numbers.add(Integer.parseInt(strNumber));");
            bufferedWriter.newLine();
            bufferedWriter.write("          }");
            bufferedWriter.newLine();
            bufferedWriter.write("        }");
            bufferedWriter.newLine();
            bufferedWriter.write("        int k = 0;");
            bufferedWriter.newLine();
            bufferedWriter.write("        for(int i = 0; i < row; i++){");
            bufferedWriter.newLine();
            bufferedWriter.write("          for(int j = 0; j < col; j++){");
            bufferedWriter.newLine();
            bufferedWriter.write("            matrix[i][j] = numbers.get(k++);");
            bufferedWriter.newLine();
            bufferedWriter.write("          }");
            bufferedWriter.newLine();
            bufferedWriter.write("        }");
            bufferedWriter.newLine();
            bufferedWriter.write("        bufferedReader.close();");
            bufferedWriter.newLine();
            bufferedWriter.write("      } catch (Exception e){");
            bufferedWriter.newLine();
            bufferedWriter.write("        System.out.println(\"Error, reading the file '\" + file2 + \"'\");");
            bufferedWriter.newLine();
            bufferedWriter.write("      }");
            bufferedWriter.newLine();
            bufferedWriter.write("      int[] states = new int[row+1];");
            bufferedWriter.newLine();
            bufferedWriter.write("      String[] msg = new String[row+1];");
            bufferedWriter.newLine();
            bufferedWriter.write("      try{");
            bufferedWriter.newLine();
            bufferedWriter.write("        Scanner scanner = new Scanner(file3);");
            bufferedWriter.newLine();
            bufferedWriter.write("        for(int i = 0; i < row+1; i++){");
            bufferedWriter.newLine();
            bufferedWriter.write("          states[i] = scanner.nextInt();");
            bufferedWriter.newLine();
            bufferedWriter.write("          msg[i] = scanner.nextLine();");
            bufferedWriter.newLine();
            bufferedWriter.write("        }");
            bufferedWriter.newLine();
            bufferedWriter.write("      } catch (Exception e){");
            bufferedWriter.newLine();
            bufferedWriter.write("        System.out.println(\"Error, reading the file '\" + file3 + \"'\");");
            bufferedWriter.newLine();
            bufferedWriter.write("      }");
            bufferedWriter.newLine();
            bufferedWriter.write("      char[] charArray = new char[col];");
            bufferedWriter.newLine();
            bufferedWriter.write("      for(int i = 0; i < a.length(); i++){");
            bufferedWriter.newLine();
            bufferedWriter.write("        charArray[i] = a.charAt(i);");
            bufferedWriter.newLine();
            bufferedWriter.write("      }");
            bufferedWriter.newLine();
            bufferedWriter.write("      Scanner scanner = new Scanner(System.in);");
            bufferedWriter.newLine();
            bufferedWriter.write("      System.out.println(\"Enter a String: \");");
            bufferedWriter.newLine();
            bufferedWriter.write("      String str = scanner.nextLine();");
            bufferedWriter.newLine();
            bufferedWriter.write("      int state = 0;");
            bufferedWriter.newLine();
            bufferedWriter.write("      for(int i = 0; i < str.length(); i++){");
            bufferedWriter.newLine();
            bufferedWriter.write("        char character = str.charAt(i);");
            bufferedWriter.newLine();
            bufferedWriter.write("        if(returnedChar(charArray, character) == '9'){");
            bufferedWriter.newLine();
            bufferedWriter.write("          state = 10000;");
            bufferedWriter.newLine();
            bufferedWriter.write("          break;");
            bufferedWriter.newLine();
            bufferedWriter.write("        }");
            bufferedWriter.newLine();
            bufferedWriter.write("        if(state != 10000){");
            bufferedWriter.newLine();
            bufferedWriter.write("          char zerOne = returnedChar(charArray, character);");
            bufferedWriter.newLine();
            bufferedWriter.write("          state = matrix[state][Character.getNumericValue(zerOne)];");
            bufferedWriter.newLine();
            bufferedWriter.write("          if(state >= 10000){");
            bufferedWriter.newLine();
            bufferedWriter.write("            break;");
            bufferedWriter.newLine();
            bufferedWriter.write("          }");
            bufferedWriter.write("        } else {");
            bufferedWriter.newLine();
            bufferedWriter.write("          break;");
            bufferedWriter.newLine();
            bufferedWriter.write("        }");
            bufferedWriter.newLine();
            bufferedWriter.write("      }");
            bufferedWriter.newLine();
            bufferedWriter.write("      System.out.println(DisplayMessage(states, msg, state));");
            bufferedWriter.newLine();
            bufferedWriter.write("    }");
            bufferedWriter.newLine();
            bufferedWriter.newLine();
            bufferedWriter.write("    private static String DisplayMessage(int[] states, String[] msg, int state) {");
            bufferedWriter.newLine();
            bufferedWriter.write("      for(int i = 0; i < states.length; i++){");
            bufferedWriter.newLine();
            bufferedWriter.write("        if(state == states[i]){");
            bufferedWriter.newLine();
            bufferedWriter.write("          return msg[i];");
            bufferedWriter.newLine();
            bufferedWriter.write("        }");
            bufferedWriter.newLine();
            bufferedWriter.write("      }");
            bufferedWriter.newLine();
            bufferedWriter.write("      return \"Invalid character symbol\";");
            bufferedWriter.newLine();
            bufferedWriter.write("    }");
            bufferedWriter.newLine();
            bufferedWriter.write("    private static char returnedChar(char[] firstChar, char character) {");
            bufferedWriter.newLine();
            bufferedWriter.write("      for(int i = 0; i < firstChar.length; i++){");
            bufferedWriter.newLine();
            bufferedWriter.write("        if(character == firstChar[i]){");
            bufferedWriter.newLine();
            bufferedWriter.write("          return Character.forDigit(i,10);");
            bufferedWriter.newLine();
            bufferedWriter.write("        }");
            bufferedWriter.newLine();
            bufferedWriter.write("      }");
            bufferedWriter.newLine();
            bufferedWriter.write("      return '9';");
            bufferedWriter.newLine();
            bufferedWriter.write("    }");
            bufferedWriter.newLine();
            bufferedWriter.write("}");

            bufferedWriter.close();
        } catch(Exception e){
            System.out.println("Error, writing to  file '" + file4 + "'");
        }
    }
}