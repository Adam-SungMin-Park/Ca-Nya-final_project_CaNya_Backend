package com.example.canya.Image.Entity;

import com.example.canya.Board.Entity.Board;
import com.example.canya.Member.Entity.Member;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String imageUrl;

    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name = "board_id")
    private Board board;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    public Image(Board board , String imageUrl, Member member){
        this.board = board;
        this.imageUrl = imageUrl;
        this.member= member;

    }
}
