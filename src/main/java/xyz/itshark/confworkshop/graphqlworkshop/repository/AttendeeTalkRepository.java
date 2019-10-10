package xyz.itshark.confworkshop.graphqlworkshop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import xyz.itshark.confworkshop.graphqlworkshop.pojo.AttendeeTalk;

import java.util.List;


@Repository
public interface AttendeeTalkRepository extends JpaRepository<AttendeeTalk, Long> {
    List<AttendeeTalk> findAllByAttendeeId(Long attendeeId);
    List<AttendeeTalk> findAllByTalkId(Long talkId);
}
