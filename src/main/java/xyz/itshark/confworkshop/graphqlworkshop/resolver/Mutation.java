package xyz.itshark.confworkshop.graphqlworkshop.resolver;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import xyz.itshark.confworkshop.graphqlworkshop.pojo.InSpeaker;
import xyz.itshark.confworkshop.graphqlworkshop.pojo.Speaker;
import xyz.itshark.confworkshop.graphqlworkshop.service.SpeakerService;

@Component
public class Mutation implements GraphQLMutationResolver {

	@Autowired
	private SpeakerService speakerService;

	public Speaker addSpeaker(InSpeaker inSpeaker) {
		Speaker speaker = new Speaker ();
		speaker.setName(inSpeaker.getName());
		if(StringUtils.isNotEmpty(inSpeaker.getTwitter())){
			speaker.setTwitter(inSpeaker.getTwitter());
		}
		return speakerService.save(speaker);
	}

	public Speaker addSpeakerFromName(String speakerName) {
		Speaker speaker = new Speaker ();
		speaker.setName(speakerName);
		return speakerService.save(speaker);
	}


}
