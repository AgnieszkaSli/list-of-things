package com.aga.listofthings.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table (name = "tasks")
public class ListWhatToBuy extends BaseEntitySupClass{

    @NotBlank
    @Size(max = 255)
    @Column(unique = true, nullable = false)
    private String taskName;

}
