package io.insultgeneratorapi.api;

import io.insultgeneratorapi.insulter.Insult;
import io.insultgeneratorapi.insulter.InsultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InsultGeneratorApi {

    private final InsultService insultService;

    @Autowired
    public InsultGeneratorApi(InsultService insultService) {
        this.insultService = insultService;
    }

    @RequestMapping(path = "/api", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public Insult getInsult() {
        return insultService.getInsult();
    }
}
