package com.example.canya.Board.Repository;

import com.example.canya.Board.Entity.Board;
import com.example.canya.Member.Entity.Member;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<Board,Long> {

    Slice<Board> findBoardByMemberMemberNicknameContaining(String keyword, Pageable pageable);
    List<Board> findBoardByMember(Member member);
    List<Board> findAllByOrderByCreatedAtDesc();
    Slice<Board> findAllByOrderByCreatedAtDesc(Pageable pageable);
    List<Board> findByMember_MemberIdOrderByCreatedAtDesc(Long memberId, Pageable pageable);



//    List<Board> findTop6ByCreatedAtDesc();
//    List<Board> findAllByOrderByTotalRating();
    Slice<Board> findBoardsByHighestRatingContainingOrderByTotalHeartCountDesc(String ratingName, Pageable pageable);
//    Slice<Board> findBoardsByHighestRatingContainingOrderByTotalHeartCountDesc(String ratingName, Pageable pageable);

    Slice<Board> findBoardsByOrderByTotalHeartCountDesc(Pageable pageable);

}
