package com.example.filereader_bufferedreader;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

@SpringBootApplication
public class FileReaderBufferedReaderApplication {
    //abrindo e fechando manualmente os Stream.
    public static void main(String[] args) {

        //criando caminho do arquivo.
        String path = "c:\\temp\\in.txt";
        //instanciando direto no bloco try-with-resources
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            //o readLine irá ler uma linha do arquivo e se o arquivo estiver no final, irá retornar null.
            String line = br.readLine();

            while(line != null){
                //imprimir a linha
                System.out.println(line);
                // ler novametne outra linha.
                line = br.readLine();
            }

        }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }

}
