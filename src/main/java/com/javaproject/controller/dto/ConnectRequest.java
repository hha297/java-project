package com.javaproject.controller.dto;

import com.javaproject.model.Player;
import lombok.Data;

@Data
public class ConnectRequest {
    private Player player;
    private String gameId;
}
