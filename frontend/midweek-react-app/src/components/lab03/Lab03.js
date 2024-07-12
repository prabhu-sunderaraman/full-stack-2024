import { Button, FormControl, FormControlLabel, FormLabel, InputLabel, MenuItem, Radio, RadioGroup } from '@mui/material';
import TextField from '@mui/material/TextField';
import { Select } from 'antd';

const Lab03 = () => {
    return (<div style={{margin: "10px", padding: "10px", width: "400px"}}>
        <h4>Lab03 using MUI components</h4>
        <TextField id="standard-basic" label="Name" variant="standard" /> <br/>
        <TextField id="standard-basic" label="Email" type="email" variant="standard" /> <br/>
        <TextField id="standard-basic" label="Years of experience" type="number" variant="standard" /> <br/><br/>
        <FormControl sx={{minWidth: 100}}>
        <Select
          id="demo-simple-select-helper"
          label="Country">
          <MenuItem value="">
            <em>None</em>
          </MenuItem>
          <MenuItem value={10}>Ten</MenuItem>
          <MenuItem value={20}>Twenty</MenuItem>
          <MenuItem value={30}>Thirty</MenuItem>
        </Select>
      </FormControl> <br/> <br/>
      <FormControl>
      <FormLabel id="demo-row-radio-buttons-group-label">Gender</FormLabel>
      <RadioGroup
        row
        aria-labelledby="demo-row-radio-buttons-group-label"
        name="row-radio-buttons-group"
      >
        <FormControlLabel value="female" control={<Radio />} label="Female" />
        <FormControlLabel value="male" control={<Radio />} label="Male" />
        <FormControlLabel value="other" control={<Radio />} label="Other" />
      </RadioGroup>
    </FormControl> <br/> <br/>
    <hr/>
    <Button variant="contained">Register</Button>
    </div>);
};

export default Lab03;