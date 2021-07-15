package com.xiong.trpg.resources.impl;

import com.xiong.trpg.bean.Game;
import com.xiong.trpg.bean.Person;
import com.xiong.trpg.repository.GameRepository;
import com.xiong.trpg.repository.PersonRepository;
import com.xiong.trpg.resources.GameService;
import com.xiong.trpg.utils.TokenHolder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class GameServiceImpl implements GameService {
    @Autowired
    private GameRepository gameRepository;
    @Autowired
    private PersonRepository personRepository;

    @Override
    public String raiseGameAsKeeper(String alias,String fileUUID,Integer decade) {
        String user=TokenHolder.getCurrentUser();

        Person p=new Person(null,user,null);
        ExampleMatcher matcher=ExampleMatcher.matching()
                .withMatcher("name",match -> match.exact());
        Example<Person> example=Example.of(p,matcher);
        Person person= personRepository.findOne(example).get();

        Game game=new Game();
        game.setKeeper(person);
        game.setGameUUID(UUID.randomUUID().toString());
        game.setAlias(alias);
        game.setFileUUID(fileUUID);
        game.setInDecade(decade);

        gameRepository.save(game);

        return game.getGameUUID();
    }
}
