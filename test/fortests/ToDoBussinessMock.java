package fortests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Arrays;
import java.util.List;

import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
class ToDoBussinessMock {

    @InjectMocks
    ToDoBussiness toDoBussiness;

    @Mock
    ToDoService servicemock;

    @Test
    public void deleteTodoUsingMock() {
        // Given
        List<String> combinedlist = Arrays.asList("Use Hibernate Java",
                "Use Hibernate Core", "Use Hibernate", "Use Spring MVC");
        given(servicemock.getAllTodos("dummy")).willReturn(combinedlist);
        // A comment is added in my-other-branch
    }
}