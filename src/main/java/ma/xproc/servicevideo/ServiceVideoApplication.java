package ma.xproc.servicevideo;

import ma.xproc.servicevideo.Entity.Creator;
import ma.xproc.servicevideo.Entity.Video;
import ma.xproc.servicevideo.Repositories.ICreatorRepository;
import ma.xproc.servicevideo.Repositories.IVideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import java.util.Date;

@SpringBootApplication
public class ServiceVideoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceVideoApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ICreatorRepository creator, IVideoRepository videoRepository)
    {
        return args -> {
            creator.save(Creator.builder().name("Yasser").email("Yasser@gmail.com").build());
            creator.save(Creator.builder().name("Yassine").email("Yassine@gmail.com").build());
            videoRepository.save(Video.builder().name("video1").url("htttps//video1").datePublication(new Date()).creator(creator.findById(2L).get()).description("This is the first vido").build());
            videoRepository.save(Video.builder().name("video2").url("htttps//video2").datePublication(new Date()).creator(creator.findById(1L).get()).description("This is the second vido").build());
        };
    }
}
