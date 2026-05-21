package com.kevinthelago.securedapi.service;

import com.kevinthelago.securedapi.dao.Fortune;
import com.kevinthelago.securedapi.repo.FortuneRepository;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class FortuneService {
    FortuneRepository fortuneRepository;
    Random random;

    public FortuneService(FortuneRepository fortuneRepository) {
        this.fortuneRepository = fortuneRepository;
        this.random = new Random();
    }

    public Fortune createFortune(String phrase) {
        Fortune fortune = new Fortune(phrase);

        return fortuneRepository.save(fortune);
    }

    public Fortune getFortune(long id) {
        Fortune fortune = fortuneRepository.findById(id).orElseThrow();
        fortune.setLuckyNumbers(generateLuckyNumbers());

        return fortune;
    }

    public Fortune getRandomFortune() {
        // ToDo: Look at this more
        List<Fortune> fortunes = fortuneRepository.findAll();

        return fortunes.get(random.nextInt(0, fortunes.size()));
    }

    public Fortune updateFortune(Fortune fortune) {
        fortuneRepository.update(fortune.getPhrase(), fortune.getId());

        return getFortune(fortune.getId());
    }

    public Fortune deleteFortune(Long id) {
        Fortune fortune = getFortune(id);
        fortuneRepository.delete(fortune);

        return fortune;
    }

    private List<Integer> generateLuckyNumbers() {
        return random.ints(1, 100).distinct().limit(6).boxed().toList();
    }

}
