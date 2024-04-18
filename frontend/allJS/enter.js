$('.form').find('input, textarea').on('keyup blur focus', function (e) {
  
  var $this = $(this),
      label = $this.prev('label');

    if (e.type === 'keyup') {
      if ($this.val() === '') {
          label.removeClass('active highlight');
        } else {
          label.addClass('active highlight');
        }
    } else if (e.type === 'blur') {
      if( $this.val() === '' ) {
        label.removeClass('active highlight'); 
      } else {
        label.removeClass('highlight');   
      }   
    } else if (e.type === 'focus') {
      
      if( $this.val() === '' ) {
        label.removeClass('highlight'); 
      } 
      else if( $this.val() !== '' ) {
        label.addClass('highlight');
      }
    }

});
  
  $('.tab a').on('click', function (e) {
    console.log(123)
    e.preventDefault();
  
    $(this).parent().addClass('active');
    $(this).parent().siblings().removeClass('active');
  
    target = $(this).attr('href');
  
    $('.tab-content > div').not(target).hide();
  
    $(target).fadeIn(600);
  
  });
  //ПОСТ ЗАПРОС С РЕГИСТРАЦИИ
document.addEventListener('DOMContentLoaded', function() {
  const form = document.getElementById('reg');

  form.addEventListener('submit', function(event) {
    event.preventDefault(); // Предотвращаем стандартное поведение формы

    const formData = new FormData(form); // Создаем объект FormData из данных формы

    fetch('http://localhost:81', {
      method: 'POST',
      body: formData // Устанавливаем данные для отправки
    })
    .then(response => {
      if (!response.ok) {
        throw new Error('Произошла ошибка при выполнении запроса');
      }
      // return response.text(); // Возвращаем текст ответа
    })
    .then(data => {
      console.log('Успешный ответ от сервера:', data);
      // Дополнительная обработка ответа
    })
    .catch(error => {
      console.error('Ошибка при выполнении запроса:', error.message);
    });
  });
});
//ФЕТЧ ЗАПРОС АВТОРИЗАЦИИ 
document.addEventListener('DOMContentLoaded', function() {
  const form = document.getElementById('enter'); // Выбор формы по id

  form.addEventListener('submit', function(event) {
    event.preventDefault(); // Предотвращаем стандартное поведение формы

    const formData = new FormData(form); // Создаем объект FormData из данных формы

    fetch('http://localhost:81', {
      method: 'POST',
      body: formData // Устанавливаем данные для отправки
    })
    .then(response => {
      if (!response.ok) {
        throw new Error('Произошла ошибка при выполнении запроса');
      }
      // return response.text(); // Возвращаем текст ответа
    })
    .then(data => {
      console.log('Успешный ответ от сервера:', data);
      // Дополнительная обработка ответа
    })
    .catch(error => {
      console.error('Ошибка при выполнении запроса:', error.message);
    });
  });
});

  