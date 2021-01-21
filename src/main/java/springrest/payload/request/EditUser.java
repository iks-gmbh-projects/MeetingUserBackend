package springrest.payload.request;

import lombok.*;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EditUser {

  private int id;

  @Size(min = 5, max = 60)
  private String currentPassword;

  @Size(min = 5, max = 60)
  private String newPassword;

  @NotBlank
  @Size(max = 50)
  private String firstname;

  @NotBlank
  @Size(max = 50)
  private String lastname;

  @NotBlank
  @Size(max = 100)
  @Email
  private String email;

  @NotBlank
  @Size(max = 100)
  private String company;

}