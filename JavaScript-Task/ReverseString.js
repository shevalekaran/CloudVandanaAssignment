//A. Take a sentence as an input and reverse every word in that sentence.a. Example - This is a sunny day > shiT si a ynnus yad.  
//CandidateName = Karan_Shewale www.shevalekaran1@gmail.com


function reverseWords(sentence) {
  let reversedSentence = '';
  let currentWord = '';
  for (let i = 0; i < sentence.length; i++) {
    if (sentence[i] !== ' ') {
      currentWord = sentence[i] + currentWord;
    } else {
      reversedSentence += currentWord + ' ';
      currentWord = '';
    }
  }
  reversedSentence += currentWord;
  return reversedSentence;
}

const inputSentence = 'This is a sunny day';
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);

//OUTPUT = sihT si a ynnus yad