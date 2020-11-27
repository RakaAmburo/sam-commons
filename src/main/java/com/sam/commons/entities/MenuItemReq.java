package com.sam.commons.entities;

import lombok.Data;

import java.util.UUID;

@Data
public class MenuItemReq {
    private UUID id;
    private MenuItemDTO menuItemDTO;
    private Action action;
    private Status status;
}
