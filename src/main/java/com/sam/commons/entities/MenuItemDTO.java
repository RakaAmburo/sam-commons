package com.sam.commons.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDTO {

    private String id;

    private String restaurantId;

    private String languageId;

    private List<GroupsDTO> groups;

    private String title;

    private String description;

    private List<PriceDTO> prices;
}
