package br.com.mi80.api_covid19.dto;

import java.time.LocalDateTime;

public record ErroResponse(
        Integer status,
        String erro,
        String mensagem,
        String caminho,
        LocalDateTime timeStamp
) {

    public ErroResponse ErroResponse(Integer status, String erro, String mensagem, String caminho, LocalDateTime timeStamp){
        return new ErroResponse(status, erro, mensagem, caminho, LocalDateTime.now());
    }
}
