package xyz.itshark.confworkshop.graphqlworkshop.pojo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Score {

	private String title;
	private Integer score;
}
