package ImageHoster.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ImageHoster.model.Comment;
import ImageHoster.repository.CommentRepository;
import ImageHoster.repository.ImageRepository;

@Service
public class CommentService {
	@Autowired
	private CommentRepository commentRepository;

	// The method calls the addComment() method in the Repository and passes the
	// comments of the image to be comment table in the database
	public void addComment(Comment c) {
		commentRepository.addComment(c);
	}
}
