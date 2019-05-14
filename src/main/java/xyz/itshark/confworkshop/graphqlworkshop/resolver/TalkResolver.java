package xyz.itshark.confworkshop.graphqlworkshop.resolver;

import com.coxautodev.graphql.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.itshark.confworkshop.graphqlworkshop.pojo.Speaker;
import xyz.itshark.confworkshop.graphqlworkshop.pojo.Talk;
import xyz.itshark.confworkshop.graphqlworkshop.service.SpeakerService;

import java.util.List;

@Component
public class TalkResolver implements GraphQLResolver<Talk> {

	@Autowired
	private SpeakerService speakerService;

	public List<Speaker> speakers(Talk talk) {
	return speakerService.findAllSpeakersForTalk (talk);
	}
}
