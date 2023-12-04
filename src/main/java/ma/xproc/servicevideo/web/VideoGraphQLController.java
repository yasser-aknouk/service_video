package ma.xproc.servicevideo.web;

import ma.xproc.servicevideo.Entity.Creator;
import ma.xproc.servicevideo.Entity.Video;
import ma.xproc.servicevideo.Repositories.ICreatorRepository;
import ma.xproc.servicevideo.Repositories.IVideoRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class VideoGraphQLController {
private ICreatorRepository creatorRepository;
private IVideoRepository videoRepository;

VideoGraphQLController(ICreatorRepository creatorRepository, IVideoRepository videoRepository)
{
    this.videoRepository=videoRepository;
    this.creatorRepository=creatorRepository;
}

    @QueryMapping
    public List<Video> videoList()
    { return videoRepository.findAll();}


    @QueryMapping
    public Creator creatorById(@Argument Long id)
    {
        return creatorRepository.findById(id)
                .orElseThrow(()-> new RuntimeException(String.format("creator %s not found",id)));
    }
}
