package xyz.itshark.confworkshop.graphqlworkshop.resolver;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.itshark.confworkshop.graphqlworkshop.pojo.Speaker;
import xyz.itshark.confworkshop.graphqlworkshop.pojo.Talk;
import xyz.itshark.confworkshop.graphqlworkshop.service.SpeakerService;
import xyz.itshark.confworkshop.graphqlworkshop.service.TalkService;

import java.util.List;

@Component
public class Query implements GraphQLQueryResolver {

	@Autowired
	private SpeakerService speakerService;

	@Autowired
	private TalkService talkService;

	public List<Talk> allTalks() {
		return talkService.findAll();
	}

	public List<Speaker> allSpeakers(){
		return speakerService.findAll();
	}

	public List<Object> allAll(){
		List talks = talkService.findAll();
		List speakers = speakerService.findAll();
		talks.addAll (speakers);
		return talks;
	}

	public List<Talk> allSpeakerTalks(Speaker speaker)
	{
		return talkService.findAllTalksBySpeaker(speaker);
	}
}