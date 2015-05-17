package com.ws.impl;

import com.bowling.dao.PlayerDAO;
import com.bowling.entity.Player;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ws.itf.IBowlingUser;

import javax.ws.rs.core.Response;
import java.util.List;

public class BowlingUser implements IBowlingUser {

    @Override
    public Response getUsers() {
        return null;
    }

    @Override
    public Response getUser(int user_id) throws JsonProcessingException {
        return null;
    }

    @Override
    public Response getPlayersForOneGame(int game_id) throws JsonProcessingException {
        ObjectMapper mapper  = new ObjectMapper();
        List<Player> players   = new PlayerDAO().getScoresByGameId(game_id);

        return Response.status(200).entity(mapper.writeValueAsString(players)).build();
    }
}