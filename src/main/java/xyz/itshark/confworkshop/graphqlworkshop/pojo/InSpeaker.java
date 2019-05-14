package xyz.itshark.confworkshop.graphqlworkshop.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class InSpeaker {

    @NonNull
    private String name;
    private String twitter;

}